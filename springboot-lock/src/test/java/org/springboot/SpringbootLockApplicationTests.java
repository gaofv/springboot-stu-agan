package org.springboot;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springboot.dao.ApplicationInfoDao;
import org.springboot.entity.ApplicationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@MapperScan("org.springboot.dao")
@Slf4j
class SpringbootLockApplicationTests {

    @Autowired
    private ApplicationInfoDao applicationInfoDao;

    private int count = 10000;

    @Test
    void contextLoads() {

    }

//    @Test
//    public void insert() {
//        List<ApplicationInfo> list = new ArrayList<>();
//        ApplicationInfo app = null;
//        for (int i = 0; i < count; i++) {
//            app = new ApplicationInfo();
//            app.setAppKey(i + "");
//            app.setAppName("APP" + i);
//            app.setAppDescription("DESC" + i);
//            app.setAppNum(i);
//            list.add(app);
//        }
//        applicationInfoDao.batchUpdateReplaceInto(list);
//    }

    @Test
    public void batchUpdateSql() {
        List<ApplicationInfo> list = new ArrayList<>();
        ApplicationInfo app = null;
        for (int i = 0; i < count; i++) {
            app = new ApplicationInfo();
            app.setAppKey(i + "");
            app.setAppName("APP" + i + i);
            app.setAppDescription("DESC" + i + i);
            app.setAppNum(i);
            list.add(app);
        }

        long start = System.currentTimeMillis();
        applicationInfoDao.batchUpdateSql(list);
        log.info("批量更新" + count + "条数据，耗时为：{}ms", System.currentTimeMillis() - start);
    }

//    @Test
//    public void batchUpdateReplaceInto() {
//        List<ApplicationInfo> list = new ArrayList<>();
//        ApplicationInfo app = null;
//        for (int i = 0; i < count; i++) {
//            app = new ApplicationInfo();
//            app.setAppKey(i + "");
//            app.setAppName("APP" + i + i);
//            app.setAppDescription("DESC" + i + i);
//            app.setAppNum(i);
//            list.add(app);
//        }
//
//        long start = System.currentTimeMillis();
//        applicationInfoDao.batchUpdateReplaceInto(list);
//        log.info("replace into批量更新" + count + "条数据，耗时为：{}ms", System.currentTimeMillis() - start);
//    }

    @Test
    public void batchUpdateDuplicateKey() {
        List<ApplicationInfo> list = new ArrayList<>();
        ApplicationInfo app = null;
        for (int i = 0; i < count; i++) {
            app = new ApplicationInfo();
            app.setAppKey(i + "");
            app.setAppName("APP" + i + i);
            app.setAppDescription("DESC" + i + i);
            app.setAppNum(i);
            list.add(app);
        }

        long start = System.currentTimeMillis();
        applicationInfoDao.batchUpdateDuplicateKey(list);
        log.info("duplicate key批量更新" + count + "条数据，耗时为：{}ms", System.currentTimeMillis() - start);
    }

//    @Test
//    public void batchUpdateCaseWhen() {
//        List<ApplicationInfo> list = new ArrayList<>();
//        ApplicationInfo app = null;
//        for (int i = 0; i < count; i++) {
//            app = new ApplicationInfo();
//            app.setAppKey(i + "");
//            app.setAppName("APP" + i + i);
//            app.setAppDescription("DESC" + i + i);
//            app.setAppNum(i);
//            list.add(app);
//        }
//
//        long start = System.currentTimeMillis();
//        applicationInfoDao.batchUpdateCaseWhen(list);
//        log.info("case when批量更新" + count + "条数据，耗时为：{}ms", System.currentTimeMillis() - start);
//    }
}
