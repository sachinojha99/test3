var TestApp2 = function() {};

TestApp2.prototype.show = function(num1,num2,success, fail) {
	
	
    cordova.exec(success, fail, "TestAppPlugin2","show", [num1,num2]);
};

var ts2 = new TestApp2();
module.exports = ts2;