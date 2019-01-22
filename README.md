# <center>apiengine-sample</center>
  apiengine可为code实时生成api文档，包括rest与thrift。coder无需针对apiengine做任何额外的工作，只需按Javadoc标准写好注释即可。

### 优势
+ code与文档同步：文档实时根据code生成，2者保持一致，不会存在文档落后于code的情况，避免因文档不一致而进行的沟通
+ 开发者只需关心代码，无需人工编写文档，增加编码时间

### 相对其他同类产品的优势
+ 对业务代码无侵入：直接从注释中提取信息，且无需引入额外的包
+ 无学习成本：code的注释遵循JavaDoc标准即可（通常为@param），无自定义语法，没有学习成本
+ 接入成本低：启动apiengine，在代码服务器设置webhook地址即成功接入
+ 自动化：通过git提交代码后，即实时生成api，无需人工干预
+ 自动识别外部jar包中的类：项目project-web与project-client分别含有类classA、classB（classA中含数据成员classB），现需为项目project-web生成api，apiengine可自动识别依赖的外部jar中的类并提取其注释，当project-client中的classB有变化时，project-web的api会实时同步更新，无需人工维护2者的依赖关系
+ api版本管理：支持历史api的查看及对比
+ 在线编缉api：若用户觉得从注释中提取的api文档描述需要修改，且代码已上线再修改注释流程较麻烦，可直接在web端在线修改api文档
+ mock（开发中）：打开mock开关，可随机mock数据，无需为每个api的字段手动输入mock的数据

### 布署方式
+ 一台centos机器
+ 安装mongodb
+ 在centos上新建用户用于运行apiengine服务，此用户要拥有从代码服务器(如github、bitbucket)读代码的权限
+ 在代码服务器上设置各code项目的webhook地址为apiengine服务的地址（各项目的webhook地址完全一样）
