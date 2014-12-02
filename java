$(document).ready(function() {

/* Homepage & site-wide */

$("div").css("border", "3px solid red");

$(function() {
	$('.container').unslider();
});

$(function(){
$('#menu').click(function() {
	$('.submenu').show(1000);
	});

$('#menu').stop(function() {
	$('#popup').hide(1000);
	});
/* Photo page */

/* About Page */

$('#icon-item').hover(function() {
	$('icon-item').addClass('icon-item-active');
}

});
