var url = window.location.href;

var queryStart = url.indexOf("?") + 1;
var queryEnd   = url.length;
var query = url.slice(queryStart, queryEnd - 1);
var rawFile = new XMLHttpRequest();
    rawFile.open("GET", "./content.json", true);
    rawFile.responseType = 'text';
    rawFile.onload = function ()
    {
        if(rawFile.readyState === 4)
        {
            if(rawFile.status === 200 || rawFile.status == 0)
            {
                var allText = rawFile.responseText;
                var myArr = JSON.parse(allText);
                if(localStorage.getItem("lastname")!=null&&localStorage.getItem("lastname")!=""){
                    var ls = {
                    "lastname":localStorage.getItem("lastname"),
                    "firstname":localStorage.getItem("firstname"),
                    "phonenumber":localStorage.getItem("phonenumber"),
                    "address":localStorage.getItem("address"),
                    "birthday":localStorage.getItem("birthday"),
                    "image":localStorage.getItem("image")
                    }
                    myArr[myArr.length] = ls;
                }
                var fn;
                var ln;
                var ad;
                var bd;
                for(var i=0; i<myArr.length;i++){
                    if(query===myArr[i].phonenumber){
                        fn = myArr[i].firstname;
                        ln = myArr[i].lastname;
                        ad = myArr[i].address;
                        bd = myArr[i].birthday;
                        im = myArr[i].image;
                    }
                }
                document.getElementById("image").src = im;
                document.getElementById("firstname").innerHTML = fn;
                document.getElementById("lastname").innerHTML = ln;
                document.getElementById("address").innerHTML = ad;
                document.getElementById("birthday").innerHTML = bd;
                document.getElementById("phonenumber").innerHTML = query;
            }
        }
    }
    rawFile.send(null);


