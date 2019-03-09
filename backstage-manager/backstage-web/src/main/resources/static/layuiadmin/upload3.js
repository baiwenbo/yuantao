layui.config({
    base: '/layuiadmin/' //静态资源所在路径
}).extend({
    index: 'lib/index' //主入口模块
}).use(['index', 'upload'], function(){
    var $ = layui.jquery
        ,upload = layui.upload;
    //多图片上传

    upload.render({
        elem: '#topic1Four'
        ,url: '/environment/saveQuestion'
        ,multiple: true
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            /*<![CDATA[*/
            obj.preview(function(index, file, result){
                $('#topic1Four-list').append('<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img"  />')
            });
            /*]]>*/
        }
        ,done: function(res){
            //上传完毕
        }
    });
    upload.render({
        elem: '#topic1Four'
        ,url: '/environment/saveQuestion'
        ,multiple: true
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            /*<![CDATA[*/
            obj.preview(function(index, file, result){
                $('#topic1Four-list').append('<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img"  />')
            });
            /*]]>*/
        }
        ,done: function(res){
            //上传完毕
        }
    });
    upload.render({
        elem: '#topic1Four'
        ,url: '/environment/saveQuestion'
        ,multiple: true
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            /*<![CDATA[*/
            obj.preview(function(index, file, result){
                $('#topic1Four-list').append('<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img"  />')
            });
            /*]]>*/
        }
        ,done: function(res){
            //上传完毕
        }
    });
    upload.render({
        elem: '#topic1Four'
        ,url: '/environment/saveQuestion'
        ,multiple: true
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            /*<![CDATA[*/
            obj.preview(function(index, file, result){
                $('#topic1Four-list').append('<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img"  />')
            });
            /*]]>*/
        }
        ,done: function(res){
            //上传完毕
        }
    });
    upload.render({
        elem: '#topic1Four'
        ,url: '/environment/saveQuestion'
        ,multiple: true
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            /*<![CDATA[*/
            obj.preview(function(index, file, result){
                $('#topic1Four-list').append('<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img"  />')
            });
            /*]]>*/
        }
        ,done: function(res){
            //上传完毕
        }
    });
    upload.render({
        elem: '#topic1Four'
        ,url: '/environment/saveQuestion'
        ,multiple: true
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            /*<![CDATA[*/
            obj.preview(function(index, file, result){
                $('#topic1Four-list').append('<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img"  />')
            });
            /*]]>*/
        }
        ,done: function(res){
            //上传完毕
        }
    });
    upload.render({
        elem: '#topic1Four'
        ,url: '/environment/saveQuestion'
        ,multiple: true
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            /*<![CDATA[*/
            obj.preview(function(index, file, result){
                $('#topic1Four-list').append('<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img"  />')
            });
            /*]]>*/
        }
        ,done: function(res){
            //上传完毕
        }
    });
    upload.render({
        elem: '#topic1Four'
        ,url: '/environment/saveQuestion'
        ,multiple: true
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            /*<![CDATA[*/
            obj.preview(function(index, file, result){
                $('#topic1Four-list').append('<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img"  />')
            });
            /*]]>*/
        }
        ,done: function(res){
            //上传完毕
        }
    });
    upload.render({
        elem: '#topic1Four'
        ,url: '/environment/saveQuestion'
        ,multiple: true
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            /*<![CDATA[*/
            obj.preview(function(index, file, result){
                $('#topic1Four-list').append('<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img"  />')
            });
            /*]]>*/
        }
        ,done: function(res){
            //上传完毕
        }
    });
    upload.render({
        elem: '#topic1Four'
        ,url: '/environment/saveQuestion'
        ,multiple: true
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            /*<![CDATA[*/
            obj.preview(function(index, file, result){
                $('#topic1Four-list').append('<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img"  />')
            });
            /*]]>*/
        }
        ,done: function(res){
            //上传完毕
        }
    });
    upload.render({
        elem: '#topic1Four'
        ,url: '/environment/saveQuestion'
        ,multiple: true
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            /*<![CDATA[*/
            obj.preview(function(index, file, result){
                $('#topic1Four-list').append('<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img"  />')
            });
            /*]]>*/
        }
        ,done: function(res){
            //上传完毕
        }
    });


});