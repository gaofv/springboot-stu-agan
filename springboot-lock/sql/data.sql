
-- mysql
CREATE TABLE IF NOT EXISTS application_info(
    `app_key` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL DEFAULT ' ' COMMENT '应用key',
    `app_name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL DEFAULT ' ' COMMENT '应用名称',
    `app_description` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL DEFAULT ' ' COMMENT '应用描述',
    `app_num` int(11) NOT NULL DEFAULT 0 COMMENT '应用数',
    PRIMARY KEY (`app_key`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '应用信息表' ROW_FORMAT = Dynamic;
