
CREATE TABLE `purchase_contract` (
  `contract_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '合同编号',
  `type` int NOT NULL COMMENT '合同类型1. 过单 2. 进货 3. 进票',
  `date` datetime NOT NULL COMMENT '合同日期',
  `supplier` varchar(255) NOT NULL COMMENT '供应商',
  `amount` int NOT NULL COMMENT '合同金额',
  `state` int DEFAULT NULL COMMENT '发票状态：0未开票1部分开票2已开票',
  `appendix` varchar(255) DEFAULT NULL COMMENT '附件',
  `update_times` int DEFAULT NULL COMMENT '更新次数',
  `creator` varchar(255) DEFAULT NULL COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `note` varchar(255) DEFAULT NULL COMMENT '备注信息',
  `id` int NOT NULL AUTO_INCREMENT COMMENT 'id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `purchase_product` (
  `id` varchar(255) NOT NULL COMMENT '商品id',
  `receipt_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '商品对应发票id',
  `trade_name` varchar(255) DEFAULT NULL COMMENT '品名',
  `product_name` varchar(255) DEFAULT NULL COMMENT '商品名称',
  `product_type` varchar(255) DEFAULT NULL COMMENT '商品型号',
  `purchase_num` int DEFAULT NULL COMMENT '采购数量',
  `unit_price` decimal(10,2) DEFAULT NULL COMMENT '单价',
  `total_price` decimal(10,2) DEFAULT NULL COMMENT '总价',
  `use_amount` int DEFAULT NULL COMMENT '使用量',
  `contract_id` varchar(255) NOT NULL COMMENT '对应合同编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `purchase_receipt` (
  `receipt_id` varchar(255) NOT NULL COMMENT '发票编号',
  `contract_id` varchar(255) NOT NULL COMMENT '合同编号',
  `receipt_date` datetime NOT NULL COMMENT '开票日期',
  `appendix` varchar(255) DEFAULT NULL COMMENT '附件',
  `update_times` int DEFAULT NULL COMMENT '更新次数',
  `receipt_type` int NOT NULL COMMENT '发票类型1.1% 2.6% 3. 9% 4.13%',
  `creator` varchar(255) DEFAULT NULL COMMENT '创建者',
  `create_date` datetime DEFAULT NULL COMMENT '创建日期',
  PRIMARY KEY (`contract_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `sale_contract` (
  `contract_id` char(19) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '合同编号',
  `belong` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '合同所属',
  `date` datetime DEFAULT NULL COMMENT '合同日期',
  `buying_unit` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '采购单位',
  `amount` bigint DEFAULT NULL COMMENT '合同金额',
  `correlation` decimal(10,0) DEFAULT NULL COMMENT '关联率',
  `status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '发票状态：1.已开票 2.部分开票 3. 未开票',
  `appendix` varchar(255) DEFAULT NULL COMMENT '附件',
  `update` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '更新次数',
  `creator` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注信息',
  `region` varchar(255) DEFAULT NULL COMMENT '区域标识',
  `receipt_id` varchar(255) DEFAULT NULL COMMENT '发票id',
  `id` int NOT NULL AUTO_INCREMENT COMMENT 'id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `sale_receipt` (
  `receipt_id` bigint NOT NULL COMMENT '发票编号',
  `contract_id` bigint NOT NULL COMMENT '合同编号',
  `receipt_date` datetime NOT NULL COMMENT '发票日期',
  `appendix` varchar(255) DEFAULT NULL COMMENT '附件',
  `update_times` int DEFAULT NULL COMMENT '更新次数',
  `trade_name` varchar(255) DEFAULT NULL COMMENT '品名',
  `product_name` varchar(255) DEFAULT NULL COMMENT '商品名',
  `product_type` varchar(255) DEFAULT NULL COMMENT '型号',
  `purchase_num` int DEFAULT NULL COMMENT '采购数量',
  `unit_price` decimal(10,2) DEFAULT NULL COMMENT '单价',
  `total_price` decimal(10,2) DEFAULT NULL COMMENT '总价',
  `use_amount` int DEFAULT NULL COMMENT '使用量',
  `receipt_type` int DEFAULT NULL COMMENT '发票类型1.1% 2.6% 3. 9% 4.13%',
  `creator` varchar(255) DEFAULT NULL COMMENT '创建者',
  `create_date` datetime DEFAULT NULL COMMENT '创建日期',
  PRIMARY KEY (`contract_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `sale_product` (
  `id` varchar(255) NOT NULL COMMENT '商品id',
  `receipt_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '商品对应发票id',
  `trade_name` varchar(255) DEFAULT NULL COMMENT '品名',
  `product_name` varchar(255) DEFAULT NULL COMMENT '商品名称',
  `product_type` varchar(255) DEFAULT NULL COMMENT '商品型号',
  `purchase_num` int DEFAULT NULL COMMENT '采购数量',
  `unit_price` decimal(10,2) DEFAULT NULL COMMENT '单价',
  `total_price` decimal(10,2) DEFAULT NULL COMMENT '总价',
  `contract_id` varchar(255) NOT NULL COMMENT '对应合同编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `stock` (
  `receipt_id` int NOT NULL COMMENT '发票编号',
  `contract_id` int NOT NULL COMMENT '合同编号',
  `bill_date` datetime DEFAULT NULL COMMENT '开票日期',
  `prod_name` varchar(255) NOT NULL COMMENT '品名',
  `video_name` varchar(255) NOT NULL COMMENT '视频名称',
  `model` varchar(255) NOT NULL COMMENT '型号',
  `corre_num` int NOT NULL COMMENT '关联数量',
  `left_num` int NOT NULL COMMENT '剩余数量',
  `total_num` int NOT NULL COMMENT '总数量',
  `price` decimal(10,2) NOT NULL COMMENT '单价',
  `total_price` decimal(10,2) NOT NULL COMMENT '总价',
  `bill_type` varchar(255) NOT NULL COMMENT '发票类型',
  `info` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`receipt_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;