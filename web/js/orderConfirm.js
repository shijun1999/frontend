$(document).ready(function(){
	var dateArray = $("#datesDisplay")[0].value.split(",");
	$('#date-picker').datepicker({
		format: "yyyymmdd",
	    weekStart: 1,
	    todayBtn: true,
	    language: "zh-CN",
	    todayHighlight: true,
	    beforeShowDay: unavailableDay,
	    beforeShowMonth: unavailableMonth,
	    beforeShowYear: unavailableYear
	});
	$('#date-picker').on("changeDate", function() {
		$('#hidden_date').val(
		        $('#date-picker').datepicker('getFormattedDate')
		    );
		var selectedDate = $('#hidden_date')[0].value;
        var $textAndPic = $('<div></div>');
    	$.ajax({
    		url: 'orderConfirm/jsonDetails?date=' + selectedDate,
    		type: 'GET',
    		dataType: 'json',
    		success: function(res){
    			for (n in res.data) {
    				$textAndPic.append('遊客識別番号: '+ res.data[n].touristIdentiNo +'<br />');
    				$textAndPic.append('予約日: '+ res.data[n].reservationDate +'<br />');
    				$textAndPic.append('状態: '+ res.data[n].status +'<br />');
    				$textAndPic.append('同意: '+ res.data[n].consent +'<br />');
    				$textAndPic.append('取消日: '+ res.data[n].cancelDate +'<br />');
    				$textAndPic.append('購入日: '+ res.data[n].orderDate +'<br />');
    				$textAndPic.append('幣種: '+ res.data[n].moneyUnit +'<br />');
    				$textAndPic.append('老人数: '+ res.data[n].oldPersonNum +'<br />');
    				$textAndPic.append('大人数: '+ res.data[n].adultNum +'<br />');
    				$textAndPic.append('子供数: '+ res.data[n].childNum +'<br />');
    				$textAndPic.append('購入種類: '+ res.data[n].orderType +'<br />');
    				$textAndPic.append('合計金額: '+ res.data[n].totalMoney +'<br />');
    				$textAndPic.append('小費: '+ res.data[n].tips +'<br />');
    				$textAndPic.append('<hr />');
    			}
                BootstrapDialog.show({
                    title: '対象者予約詳細',
                    message: $textAndPic,
                    buttons: [{
                        label: 'OK',
                        action: function(dialogRef){
                            dialogRef.close();
                        }
                    }]
                });
    		}
    	});
	});

	function unavailableDay(date) {
		var formattedDate = date.toLocaleDateString('zh-CN',{year:'numeric',month:'2-digit',day:'2-digit'}).replace(/\//g, '');
	    if ($.inArray(formattedDate.toString(), dateArray) != -1) {
            return {
                tooltip: '予約あり',
                classes: 'active'
              };
	    } else {
	    	return {
	    		classes: 'disabled'
	    	};
	    }
	}
	function unavailableMonth(date) {
		var formattedDate = date.toLocaleDateString('zh-CN',{year:'numeric',month:'2-digit',day:'2-digit'}).replace(/\//g, '').substring(0,6);
		var monthArray = new Array();
		for (n in dateArray) {
			monthArray.push(dateArray[n].substring(0, 6));
		}
	    if ($.inArray(formattedDate.toString(), monthArray) != -1) {
            return {
                tooltip: '予約あり',
                classes: 'active'
              };
	    } else {
	    	return {
	    		classes: 'disabled'
	    	};
	    }
	}
	function unavailableYear(date) {
		var formattedDate = date.getFullYear();
		var yearArray = new Array();
		for (n in dateArray) {
			yearArray.push(dateArray[n].substring(0, 4));
		}
	    if ($.inArray(formattedDate.toString(), yearArray) != -1) {
            return {
                tooltip: '予約あり',
                classes: 'active',
                data: 'active'
              };
	    } else {
	    	return {
	    		classes: 'disabled'
	    	};
	    }
	}
});
