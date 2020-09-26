from datetime import datetime 
datos=input().split()
fecha=datos[0].split("/")
y=datetime(int(fecha[2]),int(fecha[1]),int(fecha[0]));
x=datetime.weekday(y)
if(int(datos[1])%2==0):
	if(x==1 or x==3):
		print("SI")
	else:
		print("NO")
else:
	if(x==0 or x==2 or x==4):
		print("SI")
	else:
		print("NO")
