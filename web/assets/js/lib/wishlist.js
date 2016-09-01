var defaults = {
    notsaved : "Save to the Wish List",
    saved: "Remove to the Wish List"
}

function Wishlist() {
    this.links - null;
}

Wishlist.prototype.setLink = function (links) {

    this.links = links;

    for (var i=0; i < links.length; i++) {

        var link = links[i];

        (function (Wishlist, link) {
            link.addEventListener("click", function (e) {
                if(this.dataset.saved == "false") {
                    Wishlist.add(this);
                } else {
                    Wishlist.remove(this);
                }

                e.preventDefault();
            });
        } (this, link));
    }
}

Wishlist.prototype.add = function (link) {
	var curTouristIdentiNo = document.getElementById("curTouristIdentiNo").value;
	if(curTouristIdentiNo=="AI999999999"){
		document.form1.action = "touristLogin!load";
		document.form1.submit();
	}else{
	    ajaxRequest(link);
	}
}

Wishlist.prototype.remove = function (link) {
	var curTouristIdentiNo = document.getElementById("curTouristIdentiNo").value;
	if(curTouristIdentiNo=="AI999999999"){
		document.form1.action = "touristLogin!load";
		document.form1.submit();
	}else{
	    ajaxRequest(link);
	}
}

function ajaxRequest(link){
	var obj = new Object();
    obj.courseIdentiNo = document.getElementById("courseIdentiNo").value;
    obj.touristIdentiNo = document.getElementById("touristIdentiNo").value;
    obj.langId = document.getElementById("langId").value;
    obj.favoriteIdentiNo = document.getElementById("favoriteIdentiNo").value;
    
	$.ajax({
		url: 'WishAjaxJason/wishStatusSave',
		type: 'post',
		dataType: 'json',
		data: {"jsonFromWeb": JSON.stringify(obj)},
		success: function(json) {
			var obj = JSON.parse(json);
			var result = obj.result;
			/*alert(mText);*/
			if(result == ""){
				var div = document.getElementById("div_saveorcancel"); 
				if(div!=null){
					div.className = 'add-favorite'; 
				}
				link.innerHTML = defaults.notsaved;
			    link.dataset.saved = "false";
			    document.getElementById("wishImg").src = "images/icons/heart_intactive.png";
			}else{
				var div = document.getElementById("div_saveorcancel"); 
				if(div!=null){
					div.className = 'add-favorited'; 
				}
				link.innerHTML = defaults.saved;
			    link.dataset.saved = "true";
			    document.getElementById("wishImg").src = "images/icons/heart_active.png";
			}
			document.getElementById("favoriteIdentiNo").value = result;
		},
		error: function(res) {
			alert("error")
		}
	});
}
