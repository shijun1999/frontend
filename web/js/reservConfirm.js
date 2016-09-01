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
        BootstrapDialog.show({
            title: '予定詳細',
            message: $textAndPic,
            buttons: [{
                label: 'OK',
                action: function(dialogRef){
                    dialogRef.close();
                }
            }]
        });
	});

	function unavailableDay(date) {
		var formattedDate = date.toLocaleDateString('zh-CN',{year:'numeric',month:'2-digit',day:'2-digit'}).replace(/\//g, '');
	    if ($.inArray(formattedDate.toString(), dateArray) != -1) {
            return {
                tooltip: '予定あり',
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
                tooltip: '予定あり',
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
                tooltip: '予定あり',
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
