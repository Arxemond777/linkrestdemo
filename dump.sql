SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `playingWithLinkedRest` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;

CREATE TABLE IF NOT EXISTS `playingWithLinkedRest`.`game` (
  `id` INT(11) NOT NULL COMMENT '',
  `home_team_id` INT(11) NOT NULL COMMENT '',
  `visiting_team_id` INT(11) NOT NULL COMMENT '',
  `date_time` DATETIME NOT NULL COMMENT '',
  `arena` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '',
  INDEX `fk_game_team_idx` (`home_team_id` ASC)  COMMENT '',
  INDEX `fk_game_team1_idx` (`visiting_team_id` ASC)  COMMENT '',
  CONSTRAINT `fk_game_team`
    FOREIGN KEY (`home_team_id`)
    REFERENCES `playingWithLinkedRest`.`team` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_game_team1`
    FOREIGN KEY (`visiting_team_id`)
    REFERENCES `playingWithLinkedRest`.`team` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_general_ci;

CREATE TABLE IF NOT EXISTS `playingWithLinkedRest`.`team` (
  `id` INT(11) NOT NULL COMMENT '',
  `name` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '')
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_general_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

INSERT INTO `playingWithLinkedRest`.`team` (`id`, `name`) VALUES ('1', '111111');
INSERT INTO `playingWithLinkedRest`.`team` (`id`, `name`) VALUES ('2', '2222');
INSERT INTO `playingWithLinkedRest`.`team` (`id`, `name`) VALUES ('3', '3333');
INSERT INTO `playingWithLinkedRest`.`team` (`id`, `name`) VALUES ('4', '4444');
INSERT INTO `playingWithLinkedRest`.`team` (`id`, `name`) VALUES ('5', '5555');

INSERT INTO `playingWithLinkedRest`.`game` (`id`, `home_team_id`, `visiting_team_id`, `date_time`, `arena`) VALUES ('1', '2', '1', '9999-12-31 23:59:59', '1');
INSERT INTO `playingWithLinkedRest`.`game` (`id`, `home_team_id`, `visiting_team_id`, `date_time`, `arena`) VALUES ('2', '3', '2', '9999-12-31 23:59:59', '2');
INSERT INTO `playingWithLinkedRest`.`game` (`id`, `home_team_id`, `visiting_team_id`, `date_time`, `arena`) VALUES ('3', '4', '5', '9999-12-31 23:59:59', '3');