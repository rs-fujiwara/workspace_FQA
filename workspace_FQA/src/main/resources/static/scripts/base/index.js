$(document).ready(function () {

    var lab1=$("#lab1").html().trim();
    var lab2=$("#lab2").html().trim();
    $("#prePage").click(function () {
        if(lab1==1){
            alert("当ページは第一ページ目です!");
            return false;
        }
        return true;
    });
    $("#nextPage").click(function () {
        if(lab1==lab2){
            alert("最後のページです!");
            return false;
        }else if(lab2==0){
        	alert("最後のページです!");
        	return false;
        }
        return true;
    });
});


