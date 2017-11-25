# jdbcMysql
是一个使用jdbcTemplate操纵数据库的案例,此案例中也加入了junit测试

Spring boot 1.5.2版本的junit测试实现步骤
1.添加@RunWith(SpringJUnit4ClassRunner.class)注解
表示使用junit测试
2.@SpringBootTest(classes = ApplicationInit.class)
表明测试的入口

PS:1.5.2版本的@Spring boot测试入口的注解变化了
@SpringApplicationConfiguration -> @SpringBootTest
