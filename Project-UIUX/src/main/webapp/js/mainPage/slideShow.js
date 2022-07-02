/**
 * 
 */
 
 setInterval(fnSlide, 4000);
function fnSlide() {
  $('#slidePanel').animate({ 'left': -1280 }, 2000, function () {
    $('#slidePanel').css({ 'left':-1});
    $("#slidePanel div:first-child").insertAfter("#slidePanel div:last-child");
  });
};