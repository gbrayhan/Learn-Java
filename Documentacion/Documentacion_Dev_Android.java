

/*Ligar Activities
	Codigo Java para ligar activities 

	Se debe crar en la funcion onCreate

	Librerias

	import android.view.View;
	import android.content.Intent;
	import android.widget.Button;
	
	Variables a cambiar

	NOMBRE_ID
	NOMBRE_VISTA_ACTUAL
	NOMBRE_VISTA_SIGUIENTE
*/
Button siguiente;
siguiente =(Button)findViewById(R.id.NOMBRE_ID);
siguiente.setOnClickListener(new View.OnClickListener() {
	@Override
	public void onClick(View v){
		Intent siguiente =new Intent(NOMBRE_VISTA_ACTUAL.this,NOMBRE_VISTA_SIGUIENTE.class);
		startActivity(siguiente);
	}
});