form = document.getElementById('createbox');
document.getElementById("create").onclick = function(){
    var fn = document.getElementById("fn").value;
    var ln = document.getElementById("ln").value;
    var ad = document.getElementById("ad").value;
    var bd = document.getElementById("bd").value;
    var pn = document.getElementById("pn").value;
    var im = document.getElementById("im").value;
    localStorage.setItem("firstname",fn);
    localStorage.setItem("lastname",ln);
    localStorage.setItem("address",ad);
    localStorage.setItem("birthday",bd);
    localStorage.setItem("phonenumber",pn);
    localStorage.setItem("image",im);
    window.open("index.html");
}

