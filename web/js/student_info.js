$(document).ready(function(){
  $("#first").css('display','block');
  $("#second").css('display','none');
  $('.huge.ui.blue.button').on('click',function(){
    $("#second").css('display','block');
    $("#first").css('display','none');
  });
  $('#second .button').on('click',function(){
    $("#first").css('display','block');
    $("#second").css('display','none');
  })
});
