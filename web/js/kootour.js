$(document).ready(function(){
	/* initialize the calendar
	-----------------------------------------------------------------*/
	var date = new Date();
	var d = date.getDate();
	var m = date.getMonth();
	var y = date.getFullYear();


	var calendar = $('#calendar').fullCalendar({
		 buttonHtml: {
			prev: '<i class="ace-icon fa fa-chevron-left"></i>',
			next: '<i class="ace-icon fa fa-chevron-right"></i>'
		},
	
		header: {
			left: 'prev,next,today',
			center: 'title',
			right: ''
		},
		events: [
		  {
			title: 'Have been bookinged',
			start: moment().subtract(5, 'days').format('YYYY-MM-DD'),
			end: moment().subtract(1, 'days').format('YYYY-MM-DD'),
			className: 'label-success'
		  }
		]
		,
		editable: false,
		droppable: false, // this allows things to be dropped onto the calendar !!!
		selectable: false,
		selectHelper: false,
	});
});
