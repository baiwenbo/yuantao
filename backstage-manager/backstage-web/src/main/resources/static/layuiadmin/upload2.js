layui.config({
    base: '/layuiadmin/' //静态资源所在路径
}).extend({
    index: 'lib/index' //主入口模块
}).use(['index', 'upload'], function(){
    var $ = layui.jquery
        ,upload = layui.upload;
    //多图片上传

    upload.render({
        elem: '#topic11Four'
        ,url: '/environment/saveQuestion'
        ,multiple: true
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            /*<![CDATA[*/
            obj.preview(function(index, file, result){
                $('#topic11our-list').append('<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img"  />')
            });
            /*]]>*/
        }
        ,done: function(res){
            //上传完毕
        }
    });
    upload.render({
        elem: '#topic12Four'
        ,url: '/environment/saveQuestion'
        ,multiple: true
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            /*<![CDATA[*/
            obj.preview(function(index, file, result){
                $('#topic12Four-list').append('<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img"  />')
            });
            /*]]>*/
        }
        ,done: function(res){
            //上传完毕
        }
    });
    upload.render({
        elem: '#topic13Four'
        ,url: '/environment/saveQuestion'
        ,multiple: true
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            /*<![CDATA[*/
            obj.preview(function(index, file, result){
                $('#topic13Four-list').append('<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img"  />')
            });
            /*]]>*/
        }
        ,done: function(res){
            //上传完毕
        }
    });
    upload.render({
        elem: '#topic14Four'
        ,url: '/environment/saveQuestion'
        ,multiple: true
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            /*<![CDATA[*/
            obj.preview(function(index, file, result){
                $('#topic14Four-list').append('<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img"  />')
            });
            /*]]>*/
        }
        ,done: function(res){
            //上传完毕
        }
    });
    upload.render({
        elem: '#topic15Four'
        ,url: '/environment/saveQuestion'
        ,multiple: true
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            /*<![CDATA[*/
            obj.preview(function(index, file, result){
                $('#topic15Four-list').append('<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img"  />')
            });
            /*]]>*/
        }
        ,done: function(res){
            //上传完毕
        }
    });
    upload.render({
        elem: '#topic16Four'
        ,url: '/environment/saveQuestion'
        ,multiple: true
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            /*<![CDATA[*/
            obj.preview(function(index, file, result){
                $('#topic16Four-list').append('<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img"  />')
            });
            /*]]>*/
        }
        ,done: function(res){
            //上传完毕
        }
    });
    upload.render({
        elem: '#topic17Four'
        ,url: '/environment/saveQuestion'
        ,multiple: true
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            /*<![CDATA[*/
            obj.preview(function(index, file, result){
                $('#topic17Four-list').append('<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img"  />')
            });
            /*]]>*/
        }
        ,done: function(res){
            //上传完毕
        }
    });
    upload.render({
        elem: '#topic18Four'
        ,url: '/environment/saveQuestion'
        ,multiple: true
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            /*<![CDATA[*/
            obj.preview(function(index, file, result){
                $('#topic18Four-list').append('<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img"  />')
            });
            /*]]>*/
        }
        ,done: function(res){
            //上传完毕
        }
    });
    upload.render({
        elem: '#topic19Four'
        ,url: '/environment/saveQuestion'
        ,multiple: true
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            /*<![CDATA[*/
            obj.preview(function(index, file, result){
                $('#topic19Four-list').append('<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img"  />')
            });
            /*]]>*/
        }
        ,done: function(res){
            //上传完毕
        }
    });
    upload.render({
        elem: '#topic20Four'
        ,url: '/environment/saveQuestion'
        ,multiple: true
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            /*<![CDATA[*/
            obj.preview(function(index, file, result){
                $('#topic20Four-list').append('<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img"  />')
            });
            /*]]>*/
        }
        ,done: function(res){
            //上传完毕
        }
    });
    upload.render({
        elem: '#topic21Four'
        ,url: '/environment/saveQuestion'
        ,multiple: true
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            /*<![CDATA[*/
            obj.preview(function(index, file, result){
                $('#topic21Four-list').append('<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img"  />')
            });
            /*]]>*/
        }
        ,done: function(res){
            //上传完毕
        }
    });


});