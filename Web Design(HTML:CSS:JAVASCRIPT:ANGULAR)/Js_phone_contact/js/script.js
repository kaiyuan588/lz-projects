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
                
                var stickyArea = document.querySelector('.sticky-area');
                var ln = [];
                var lnfld = [];
                for(var i=0; i<myArr.length;i++){
                    ln[i] = myArr[i].lastname+" "+myArr[i].firstname;
                    lnfld[i] = myArr[i].lastname.charAt(0);
                }
                ln.sort();
                lnfld.sort();
                for(var i=0; i<lnfld.length;i++){
                    for(var j=i+1; j<lnfld.length;j++){
                        if(lnfld[j]===lnfld[i]){
                            lnfld.splice(j,1)
                            j--;
                        }
                    }
                }
                for(var i=0; i<lnfld.length;i++){
                    div1 = document.createElement('div');
                    div1.className = "firstletter";
                    div1.innerHTML = lnfld[i];
                    div2 = document.createElement('div');
                    div2.className="line";
                    stickyArea.appendChild(div1);
                    stickyArea.appendChild(div2);
                    for(var j=0; j<ln.length;j++){
                        var name = [];
                        var namesize =0; 
                        if(ln[j].charAt(0)===lnfld[i]){
                            name[namesize]=ln[j];
                            var n = ln[j]
                            var fnd = ln[j].split(" ")[1];
                            var lnd = ln[j].split(" ")[0];
                            var pn;
                            // var ad;
                            // var bd;
                            // var im;
                            for(var k=0; k<myArr.length;k++){
                                if(fnd===myArr[k].firstname && lnd===myArr[k].lastname){
                                    pn = myArr[k].phonenumber;
                                    // ad = myArr[k].address;
                                    // bd = myArr[k].birthday;
                                    // im = myArr[k].image;
                                    break;
                                }
                            }
                            form = document.createElement('form');
                            form.id = n;
                            div3 = document.createElement('div');
                            div3.className = "name";
                            div3.innerHTML = name[namesize];
                            div3.id = pn;
                            inputpn = document.createElement('input');
                            inputpn.setAttribute('type', 'hidden');
                            inputpn.setAttribute('name', pn);
                            // inputfn = document.createElement('input');
                            // inputfn.setAttribute('type', 'hidden');
                            // inputfn.setAttribute('name', fnd);
                            // inputln = document.createElement('input');
                            // inputln.setAttribute('type', 'hidden');
                            // inputln.setAttribute('name', lnd);
                            // inputim = document.createElement('input');
                            // inputim.setAttribute('type', 'hidden');
                            // inputim.setAttribute('name', im);
                            // inputbd = document.createElement('input');
                            // inputbd.setAttribute('type', 'hidden');
                            // inputbd.setAttribute('name', bd);
                            // inputad = document.createElement('input');
                            // inputad.setAttribute('type', 'hidden');
                            // inputad.setAttribute('name', ad);
                            stickyArea.appendChild(form);
                            form.appendChild(div3);
                            form.appendChild(inputpn);
                            // form.appendChild(inputad);
                            // form.appendChild(inputbd);
                            // form.appendChild(inputfn);
                            // form.appendChild(inputim);
                            // form.appendChild(inputln);
                            form.action = "sticky.html";
                            form.method = "get";
                            namesize++;
                            div3.onclick = function(){
                                this.parentElement.submit();
                            }
                        }
                    }
                }
            }
        }
    }
    rawFile.send(null);
}
readTextFile("./content.json");


