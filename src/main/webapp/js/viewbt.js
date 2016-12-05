$(document).ready(function() {
		//这个元素选择器非常好用!!!
			$("div[id^='sid']").mouseover(function() {
				$(this).animate( {
					width : 160
				}, "fast");
			});
			$("div[id^='sid']").mouseout(function() {
				$(this).animate( {
					width : 130
				}, "fast");
			});
		});
	var Xmlhttp;
	var back = "";

	function creatXmlHttpRequest() {
		if (window.XMLHttpRequest) {
			Xmlhttp = new XMLHttpRequest();
			if (Xmlhttp.overrideMimeType) {
				Xmlhttp.overrideMimeType("text/xml");
			}
		} else if (window.ActiveXObject) {
			try {
				Xmlhttp = new ActiveXObject("Msxml2.XMLHTTP");
			} catch (e) {
				Xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
			}
		}
		if (!Xmlhttp) {
			window.alert("你的浏览器不支持创建XMLhttpRequest对象");
		}
		return Xmlhttp;
	}

	function loadajax() {
		creatXmlHttpRequest();
		Xmlhttp.open("get", "InitialList?name="
				+ document.getElementById("sel1").value, true);
		//alert(document.getElementById("sel1").value);
		Xmlhttp.onreadystatechange = callback;
		Xmlhttp.send();
	}

	function callback() {
		//这两行代码可以用来测试
		alert(Xmlhttp.readyState);
		alert(Xmlhttp.status);
		if (Xmlhttp.readyState == 4) {
			if (Xmlhttp.status == 200) {
				back = Xmlhttp.responseText;
				cvt();
			}
		}
	}
	function dds(){
        alert(document.getElementById("sel2").value);
    }
    function cvt(){
        var cnt = 0, getData, flag = back.charAt(0).toString();
        document.getElementById("sel2").options.length = 0;
        if (flag != "0" ){
	        for (cnt = 0; cnt < back.length / 2 - 1; cnt++){
	            getData = back.charAt(cnt).toString();
	        	document.getElementById("sel2").options.add(new Option(getData,getData));
	        }
        }
        else{
            //alert("判断成功是武警");
            for (cnt = 0; cnt < back.length / 2 - 1; cnt =cnt + 2){
            	getData = back.substring(cnt, cnt + 2);
	        	document.getElementById("sel2").options.add(new Option(getData,getData));
            }
        }
    }
    function validateInputLength(){
    	var inputNo = document.getElementById("ipt1").value;
    	if(inputNo.length != 5) {
    		document.getElementById("nothyper").innerHTML = "输入的号码必须长度必须为5";
    		document.getElementById("ipt1").value = "";
    		alert(inputNo);
    	}
    }