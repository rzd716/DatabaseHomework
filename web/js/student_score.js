$(document).ready(function(){
  var passedTest = 0,
  highScore = 0,
  sum = 0,
  failTest = 0;

  $('tbody > tr').each(function(){
     sum +=1 ;
     if ($(this).children().last().text() >= 90) {
       passedTest +=1;
       highScore +=1;
       $(this).children().last().addClass("positive");
     }else if ($(this).children().last().text() >= 60) {
        passedTest +=1;
     }else {
       failTest += 1;
       $(this).children().last().addClass("negative")
     }
  });

  $('tfoot > tr > th').first().text("一共参加了"+sum+"次考试")
  $('tfoot > tr > th').last().text("通过考试"+passedTest+"场,  "+"获得优秀"+highScore+"场,  "+"不及格考试"+failTest+"场")
})
