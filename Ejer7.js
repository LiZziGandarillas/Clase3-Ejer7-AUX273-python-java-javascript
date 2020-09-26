process.stdin.on('data',function(data){
	var datos=data.toString().split(" ");
	var fecha=datos[0].split("/");
	var x=new Date(parseInt(fecha[2]),parseInt(fecha[1]),parseInt(fecha[0]));
	if(parseInt(datos[1])%2==0)
	{
		if(x.getDay()-1==3 || x.getDay()-1==5)
			console.log("SI");
		else
			console.log("NO");
	}
	else
	{
                if(x.getDay()-1==2 || x.getDay()-1==4 || x.getDay()-1==6)
                        console.log("SI");
                else
                        console.log("NO");
        }

	process.exit();
});
