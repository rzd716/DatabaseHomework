$(function() {
	$('.ui.vertical.pointing.menu').find('> a:eq(0)').addClass('active');
	var src = $('.ui.vertical.pointing.menu').find('> a:eq(0)').attr("id");
	$("#frame_content").attr("src",src)
	$('.ui.vertical.pointing.menu a').click(function (g) {
		var tab = $(this).closest('.fixed-container')
		tab.find('.ui.vertical.pointing.menu > a').removeClass('active');
		$(this).closest('a').addClass('active');
		g.preventDefault();
		src = $(this).closest('a').attr("id");
		$("#frame_content").attr("src",src)
	} );
});
