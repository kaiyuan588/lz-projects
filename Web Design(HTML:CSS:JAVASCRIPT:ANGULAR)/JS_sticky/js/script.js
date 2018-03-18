function readTextFile(file)
{
    var rawFile = new XMLHttpRequest();
    rawFile.open("GET", file, true);
    rawFile.responseType = 'text';
    rawFile.onload = function ()
    {
        if(rawFile.readyState === 4)
        {
            if(rawFile.status === 200 || rawFile.status == 0)
            {
                var allText = rawFile.responseText;
                var myArr = JSON.parse(allText);
                document.getElementById("blog1_title").innerHTML = myArr[0].title;
                document.getElementById("blog1_info").innerHTML = myArr[0].name+" "+myArr[0].date;
                document.getElementById("blog1_post").innerHTML = myArr[0].p;
                document.getElementById("blog2_title").innerHTML = myArr[1].title;
                document.getElementById("blog2_info").innerHTML = myArr[1].name+" "+myArr[1].date;
                document.getElementById("blog2_post").innerHTML = myArr[1].p;

            }
        }
    }
    rawFile.send(null);
}
readTextFile("./content.json");


var addButton = document.getElementById('add-anchor'),
addStickyListener = function (evt) {
    //Send AJAX call to get the stciky dom.
    var newStickyRequest = new XMLHttpRequest();
    newStickyRequest.open('GET', 'sticky.html', true);
    newStickyRequest.responseType = 'text';
    newStickyRequest.onload = function (e) {
        if (this.status == 200) {
            createSticky(this.responseText);
        }
    };
    newStickyRequest.send();
};

addButton.addEventListener('click', addStickyListener);



var createSticky = function (stickyDom) {
var stickyArea = document.querySelector('.sticky-area'),
    div = document.createElement('div');
    div.innerHTML = stickyDom;
    stickyArea.appendChild(div);
    saveListener = function (evt) {
        var w = document.getElementsByClassName("font_3");
        var x = document.getElementsByClassName("font_4");
        var y = document.getElementsByClassName("font_5");
        var z = document.getElementsByClassName("font_6");
        for(var i=0;i<z.length;i++){
            w[i+2].setAttribute("contenteditable", "false");
            x[i+2].setAttribute("contenteditable", "false");
            y[i+2].setAttribute("contenteditable", "false");
            z[i].innerHTML=" ";
        }
    };
    var z = document.getElementsByClassName("font_6");
    for(var i=0;i<z.length;i++){
        z[i].addEventListener('click', saveListener);
    }
}

