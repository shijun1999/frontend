$(document).ready(function(){
    var toursummary = $("#readmore1 > p")[0];
	var toursummaryreadmore = new ReadMore($("#readmore1"), $(toursummary).height()).init();
    
    var information = $("#readmore2 > table")[0];
    var informationreadmore = new ReadMore($("#readmore2"), $(information).height()).init();
    
    var notWorkDays = document.getElementsByName("notWorkDays");
    var disableDate = new Array();
	for (var i=0; i< notWorkDays.length; i++)
	{	
		var date = document.getElementById('notWorkDay'+i).value;
	    disableDate.push(moment(date));
	}
    
	var widgetcalendar = $('#widget-calendar').datetimepicker({
        minDate: new Date(),
        defaultDate: new Date(),
        format: "MM/DD/YYYY",
        disabledDates: disableDate
    }).on('dp.change', function(e) {
        $('#widget-calendar').data("DateTimePicker").hide();
        var selectDate = document.getElementById("widget-calendar").value;
        var obj = new Object();
	    obj.courseIdentiNo = document.getElementById("courseIdentiNo").value;
	    obj.langId = document.getElementById("langId").value;
	    obj.courseDate = selectDate;
        $.ajax({
			url: 'CourseDateSelectAjaxJason/courseDateSelect',
			type: 'post',
			dataType: 'json',
			data: {"jsonFromWeb": JSON.stringify(obj)},
			success: function(json) {
				var obj = JSON.parse(json);
				var result = obj.result;
				var select =document.getElementById('selectTime');
				select.options.length=0;
				var times = result.split(",");
				for (var i=0; i< times.length; i++)
				{
					select.options.add(new Option(times[i],times[i])); 
				}
			},
			error: function(res) {
				alert("error")
			}
		});
    });

    var wishlist = new Wishlist();
    wishlist.setLink(document.getElementsByClassName("wishlink"));
});
