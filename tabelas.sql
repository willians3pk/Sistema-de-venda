-- MySQL Script generated by MySQL Workbench
-- ter 29 set 2020 20:37:18 -03
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema bancoSistemaVenda
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bancoSistemaVenda
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bancoSistemaVenda` DEFAULT CHARACTER SET utf8mb4 ;
USE `bancoSistemaVenda` ;

-- -----------------------------------------------------
-- Table `bancoSistemaVenda`.`Endereco`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bancoSistemaVenda`.`Endereco` (
  `idEndereco` INT(11) NOT NULL AUTO_INCREMENT,
  `rua` VARCHAR(65) NULL DEFAULT NULL,
  `cep` INT(11) NULL DEFAULT NULL,
  `bairro` VARCHAR(65) NULL DEFAULT NULL,
  `numero_casa` INT(11) NULL DEFAULT NULL,
  `complemento` VARCHAR(100) NULL DEFAULT NULL,
  `estado_uf` VARCHAR(65) NULL DEFAULT NULL,
  `cidade` VARCHAR(65) NULL DEFAULT NULL,
  PRIMARY KEY (`idEndereco`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `bancoSistemaVenda`.`Fornecedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bancoSistemaVenda`.`Fornecedor` (
  `idFornecedor` INT(11) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(65) NULL DEFAULT NULL,
  `cnpj` INT(11) NULL DEFAULT NULL,
  `cpf` INT(11) NULL DEFAULT NULL,
  `endereco_id` INT(11) NULL DEFAULT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  `home-page` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idFornecedor`),
  INDEX `fk_Fornecedor_endereco` (`endereco_id` ASC) VISIBLE,
  CONSTRAINT `fk_Fornecedor_endereco`
    FOREIGN KEY (`endereco_id`)
    REFERENCES `bancoSistemaVenda`.`Endereco` (`idEndereco`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `bancoSistemaVenda`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bancoSistemaVenda`.`cliente` (
  `idcliente` INT(11) NOT NULL AUTO_INCREMENT,
  `cliente_desde` DATE NULL DEFAULT NULL,
  `limite_credito` DECIMAL(10,0) NULL DEFAULT NULL,
  PRIMARY KEY (`idcliente`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `bancoSistemaVenda`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bancoSistemaVenda`.`usuario` (
  `idusuario` INT(11) NOT NULL AUTO_INCREMENT,
  `data_emissao` DATE NULL DEFAULT NULL,
  `data_demissao` DATE NULL DEFAULT NULL,
  `previlegios` INT(11) NULL DEFAULT NULL,
  `status` BIT(1) NULL DEFAULT NULL,
  PRIMARY KEY (`idusuario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `bancoSistemaVenda`.`pessoa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bancoSistemaVenda`.`pessoa` (
  `idpessoa` INT(11) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(65) NULL DEFAULT NULL,
  `cpf` INT(11) NULL DEFAULT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  `numero_contato` INT(11) NULL DEFAULT NULL,
  `data_nascimento` DATE NULL DEFAULT NULL,
  `usuario_id` INT(11) NULL DEFAULT NULL,
  `cliente_id` INT(11) NULL DEFAULT NULL,
  `endereco_id` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`idpessoa`),
  INDEX `fk_pessoa_usuario` (`usuario_id` ASC) VISIBLE,
  INDEX `fk_pessoa_cliente` (`cliente_id` ASC) VISIBLE,
  INDEX `fk_pessoa_endereco` (`endereco_id` ASC) VISIBLE,
  CONSTRAINT `fk_pessoa_cliente`
    FOREIGN KEY (`cliente_id`)
    REFERENCES `bancoSistemaVenda`.`cliente` (`idcliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pessoa_endereco`
    FOREIGN KEY (`endereco_id`)
    REFERENCES `bancoSistemaVenda`.`Endereco` (`idEndereco`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pessoa_usuario`
    FOREIGN KEY (`usuario_id`)
    REFERENCES `bancoSistemaVenda`.`usuario` (`idusuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `bancoSistemaVenda`.`Numero_contato`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bancoSistemaVenda`.`Numero_contato` (
  `idNumero_contato` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `ddd` INT(11) NULL DEFAULT NULL,
  `fone` INT(11) NULL DEFAULT NULL,
  `cpf` INT(11) NULL DEFAULT NULL,
  `pessoa_id` INT(11) NULL DEFAULT NULL,
  `fornecedor_id` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`idNumero_contato`),
  INDEX `fk_Numero_contato_pessoa` (`pessoa_id` ASC) VISIBLE,
  INDEX `fk_Numero_contato_fornecedor` (`fornecedor_id` ASC) VISIBLE,
  CONSTRAINT `fk_Numero_contato_fornecedor`
    FOREIGN KEY (`fornecedor_id`)
    REFERENCES `bancoSistemaVenda`.`Fornecedor` (`idFornecedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Numero_contato_pessoa`
    FOREIGN KEY (`pessoa_id`)
    REFERENCES `bancoSistemaVenda`.`pessoa` (`idpessoa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `bancoSistemaVenda`.`forma_pagamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bancoSistemaVenda`.`forma_pagamento` (
  `idforma_pagamento` INT(11) NOT NULL AUTO_INCREMENT,
  `cartao debito` VARCHAR(45) NULL DEFAULT NULL,
  `dinheiro a vista` VARCHAR(45) NULL DEFAULT NULL,
  `parcelado 1x` VARCHAR(45) NULL DEFAULT NULL,
  `parcelado 3x` VARCHAR(45) NULL DEFAULT NULL,
  `parcelado 5x` VARCHAR(45) NULL DEFAULT NULL,
  `parcelado 10x` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idforma_pagamento`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `bancoSistemaVenda`.`items`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bancoSistemaVenda`.`items` (
  `iditem` INT(11) NOT NULL AUTO_INCREMENT,
  `item` VARCHAR(45) NULL DEFAULT NULL,
  `valor_compra` DECIMAL(10,0) NULL DEFAULT NULL,
  `valor_venda` DECIMAL(10,0) NULL DEFAULT NULL,
  `status` BIT(1) NOT NULL,
  `peso` DECIMAL(10,0) NULL DEFAULT NULL,
  `codigo` INT(11) NOT NULL,
  `qnt` INT(11) NULL DEFAULT NULL,
  `descricao` VARCHAR(200) NULL DEFAULT NULL,
  `fornecedor_id` INT(11) NULL DEFAULT NULL,
  `valor_total` DECIMAL(10,0) NULL DEFAULT NULL,
  PRIMARY KEY (`iditem`),
  INDEX `fk_items_fornecedor` (`fornecedor_id` ASC) VISIBLE,
  CONSTRAINT `fk_items_fornecedor`
    FOREIGN KEY (`fornecedor_id`)
    REFERENCES `bancoSistemaVenda`.`Fornecedor` (`idFornecedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 15
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `bancoSistemaVenda`.`venda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bancoSistemaVenda`.`venda` (
  `idvenda` INT(11) NOT NULL AUTO_INCREMENT,
  `data_venda` DATETIME NULL DEFAULT NULL,
  `forma_pagamento_id` INT(11) NULL DEFAULT NULL,
  `codigo_venda` INT(11) NOT NULL,
  `descricao` VARCHAR(200) NULL DEFAULT NULL,
  `status` BIT(1) NULL DEFAULT NULL,
  `usuario_id` INT(11) NULL DEFAULT NULL,
  `cliente_id` INT(11) NULL DEFAULT NULL,
  `valorTotal` DECIMAL(10,0) NULL DEFAULT NULL,
  PRIMARY KEY (`idvenda`),
  INDEX `fk_venda_usuario` (`usuario_id` ASC) VISIBLE,
  INDEX `fk_venda_cliente` (`cliente_id` ASC) VISIBLE,
  INDEX `fk_venda_pagamento` (`forma_pagamento_id` ASC) VISIBLE,
  CONSTRAINT `fk_venda_cliente`
    FOREIGN KEY (`cliente_id`)
    REFERENCES `bancoSistemaVenda`.`cliente` (`idcliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_venda_pagamento`
    FOREIGN KEY (`forma_pagamento_id`)
    REFERENCES `bancoSistemaVenda`.`forma_pagamento` (`idforma_pagamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_venda_usuario`
    FOREIGN KEY (`usuario_id`)
    REFERENCES `bancoSistemaVenda`.`usuario` (`idusuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `bancoSistemaVenda`.`itens_venda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bancoSistemaVenda`.`itens_venda` (
  `iditens_venda` INT(11) NOT NULL AUTO_INCREMENT,
  `qnt` INT(11) NULL DEFAULT NULL,
  `item` INT(11) NULL DEFAULT NULL,
  `venda_id` INT(11) NULL DEFAULT NULL,
  `status` BIT(1) NULL DEFAULT NULL,
  PRIMARY KEY (`iditens_venda`),
  INDEX `fk_itens_venda_item` (`item` ASC) VISIBLE,
  INDEX `fk_itens_venda_venda` (`venda_id` ASC) VISIBLE,
  CONSTRAINT `fk_itens_venda_item`
    FOREIGN KEY (`item`)
    REFERENCES `bancoSistemaVenda`.`items` (`iditem`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_itens_venda_venda`
    FOREIGN KEY (`venda_id`)
    REFERENCES `bancoSistemaVenda`.`venda` (`idvenda`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
