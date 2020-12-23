function validateAddBookForm() {
    return $("#ContentForm").validate({
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
            },
            delFlag:{
                required:true
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
            },
            delFlag:{
                required:"公開設定を選択してください"
            }
        }
    });
}


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
            selectObj.options.add(new Option("————選択してください————",0));
            for(var i=0;i<data.length;i++){
                selectObj.add(new Option(optionJson[i].childCategoryName,i+1));
            }
        }
    })
	
}

function upContent() {
	if(validateAddBookForm().form()){
		var i = $("select[name='cid']").val();
	    $.ajax({
	        async : false,
	        type : 'post',
	        url : '/updateFqaData',
	        data : $('#ContentForm').serialize(),
	        success : function(data) {
	            $('#test').replaceWith("<p>管理番号"+i+"への処理が完了しました。</p>");
	            window.scrollTo(0,0);
	        },
	        error : function(data) {
	            alert("失敗しました");
	        }
	    });
	}
};