CREATE TABLE `Seller` (
  `id` int(11) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `product` (
  `id` int(11) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `seller_id` int(11) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_product_seller_idx_idx` (`seller_id`),
  CONSTRAINT `fk_product_seller_idx` FOREIGN KEY (`seller_id`) REFERENCES `Seller` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `Buyer` (
  `id` int(11) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `bid` (
  `id` int(11) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `date_of_sale` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `product_id` int(11) unsigned DEFAULT NULL,
  `buyer_id` int(11) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_bid_product_idx_idx` (`product_id`),
  KEY `fk_bid_buyer_idx_idx` (`buyer_id`),
  CONSTRAINT `fk_bid_buyer_idx` FOREIGN KEY (`buyer_id`) REFERENCES `Buyer` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_bid_product_idx` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8