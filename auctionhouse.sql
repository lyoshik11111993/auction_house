CREATE TABLE `bid` (
  `id` int(11) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `Buyer` (
  `id` int(11) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `product_id` int(11) unsigned DEFAULT NULL,
  `bid_id` int(11) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_buyer_product_idx_idx` (`product_id`),
  KEY `fk_buyer_bid_idx_idx` (`bid_id`),
  CONSTRAINT `fk_buyer_bid_idx` FOREIGN KEY (`bid_id`) REFERENCES `bid` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_buyer_product_idx` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `product` (
  `id` int(11) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `bid_id` int(11) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_product_bid_idx_idx` (`bid_id`),
  CONSTRAINT `fk_product_bid_idx` FOREIGN KEY (`bid_id`) REFERENCES `bid` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `Seller` (
  `id` int(11) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `product_id` int(11) unsigned DEFAULT NULL,
  `bid_id` int(11) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_seller_product_idx_idx` (`product_id`),
  KEY `fk_seller_bid_idx_idx` (`bid_id`),
  CONSTRAINT `fk_seller_bid_idx` FOREIGN KEY (`bid_id`) REFERENCES `bid` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_seller_product_idx` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8