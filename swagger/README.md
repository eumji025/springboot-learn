## swgger2
### 介绍
>Swagger™ is a project used to describe and document RESTful APIs.
 The Swagger specification defines a set of files required to describe such an API. These files can then be used by the Swagger-UI project to display the API and Swagger-Codegen to generate clients in various languages. Additional utilities can also take advantage of the resulting files, such as testing tools.
 Swagger™是用于描述和记录RESTful API的项目。
 Swagger规范定义了一组描述这样的API所需的文件。Swagger-UI项目可以使用这些文件来显示API和Swagger-Codegen，以生成各种语言的客户端。附加实用程序还可以利用生成的文件，如测试工具。

### config

~~~java
@EnableSwagger2
@Configuration
public class Swagger2Config {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.eumji.swagger.controller"))
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("使用swagger2构建RESTful API")
                .description("更多内容请参见swagger官网:http://swagger.io/")
                .termsOfServiceUrl("http://swagger.io/")
                .version("1.0").contact("eumji").build();
    }
}
~~~
使用@Configuration注解使springboot能够加载配置
@EnableSwagger2开启swagger2
通过createRestApi函数创建Docket的Bean之后，apiInfo()用来创建该Api的基本信息（这些基本信息会展现在文档页面中）。
select()函数返回一个ApiSelectorBuilder实例用来控制哪些接口暴露给Swagger来展现，本例采用指定扫描的包路径来定义，
Swagger会扫描该包下所有Controller定义的API，并产生文档内容（除了被@ApiIgnore指定的请求）。

### 使用
开启项目
浏览器访问: http://localhost:8080/swagger-ui.html
