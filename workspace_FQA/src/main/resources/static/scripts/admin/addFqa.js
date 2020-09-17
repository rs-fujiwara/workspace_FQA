$(document).ready(function () {

    // a.カテゴリーを検索
    findAllParentCategory();
    //findAllChildCategory()

    $("#btn1").click(function () {
        if(validateAddBookForm().form()) 
        addContent();
    });
});

function validateAddBookForm() {
    return $("#addContentForm").validate({
        rules:{
        	fqaQuestion:{
                required:true
            },
            fqaContent:{
                required:true
            },
            parentCategory:{
                required:true
            },
            childCategory:{
                required:false
            }
        } ,
        messages:{

        	fqaQuestion:{
                required:"質問を入力してください"
            },
            fqaContent:{
                required:"答えを入力してください"
            },
            parentCategory:{
                required:"カテゴリーを入力してください"
            },
            childCategory:{
                required:"カテゴリーを入力してください"
            }
        }
    });
}




function findAllParentCategory() {
    $.ajax({
        async : false,
        type : "post",
        url : "/findAllParentCategory",
        dataType : "json",
        success: function (data) {
            console.log(data);
            $("select[name='parentCategory']").empty();
            $("select[name='parentCategory']").append('<option value="">————選択してください————</option>');
            for(var i=0;i<data.length;i++){
                var html ='<option value="'+data[i].parentCategoryId+'">';
                html +=data[i].parentCategoryName + '</option>';
                $("select[name='parentCategory']").append(html);
            }
        },
        error:function (data) {
            alert(data.result);
        }
    });
};

function findAllChildCategory() {
$.ajax({
    async : false,
    type : "post",
    url : "/findAllChildCategory",
    dataType : "json",
    success: function (data) {
        console.log(data);
        $("select[name='childCategory']").empty();
        $("select[name='childCategory']").append('<option value="">————選択してください————</option>');
        for(var i=0;i<data.length;i++){
            var html ='<option value="'+data[i].childCategoryId+'">';
            html +=data[i].childCategoryName + '</option>';
            $("select[name='childCategory']").append(html);
        }
    },
    error:function (data) {
        alert(data.result);
    }
});
};

function addContent() {
    $.ajax({
        async : false,
        type : 'post',
        url : '/addFqa',
        data : $('#addContentForm').serialize(),
        success : function(data) {
            alert("FQA追加成功");
        },
        error : function(data) {
            alert("FQA追加失敗");
        }
    });
};

function setSelectChild(){
    var index1=$('#parentCategory option:selected').val();
    var optionJson=[];
    $.ajax({
        url: "/selectChild",
        type: "post",
        data: {"parent_category_id":index1},
        datatype: "json",
        success:function(data){
            optionJson = data;
            var selectObj=document.getElementById("childCategory");
            selectObj.options.length=0;
            //selectObj.options.add(new Option("————選択してください————",0));
            for(var i=0;i<data.length;i++){
                selectObj.add(new Option(optionJson[i].childCategoryName,i+1));
            }
        }
    })
	
}










