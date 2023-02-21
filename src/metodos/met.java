
package metodos;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;
import fitnessclub.Chat_Club;
import fitnessclub.bienvenido;
import fitnessclub.inicio;
import fitnessclub.usuario;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class met {
    traerdatos traer = new traerdatos(); 
    conexion c = new conexion();
    Connection con = c.conectar();
    
    

//Rgistro de usuario
    
    public void registrar2(String nombre,String correo,String telefono,String ciudad,String paswor, JFrame frame){
    
        if(nombre.isEmpty()| correo.isEmpty()|telefono.isEmpty()|ciudad.isEmpty()|paswor.isEmpty()){//COMPARO QUE LOS CAMPOS NO ESTEN VACIOS, SI LO ESTAN SALTA EL PANEL DE AVISO
            JOptionPane.showMessageDialog(null,"LLENE TODOS LOS CAMPOS");
        }else{
            
                if(correo.contains("@gmail.com") || correo.contains("@soysena.com") || correo.contains("@misena.com") || correo.contains("@hotmail.com") || correo.contains("@outlook.com")|| correo.contains("@misena.edu.co")|| correo.contains("@sena.co")){
                //VALIDO QUE EL CORREO SEA ALGUNO DE LOS VALIDOS
                    String id = null;
                    
                    //verifico si el correose encuentra en la tabla, si el valor es diferente de null entonces esta en uso
                    try {
                        PreparedStatement ps=con.prepareStatement("SELECT id_usuario from tb_usuario where correo='"+correo+"'");
                        ResultSet rs = ps.executeQuery();
                        if(rs.next()){
                                id = rs.getString("id_usuario");
                        }
                        if (id!=null ) {
                            JOptionPane.showMessageDialog(null,"ESTE CORREO YA ESTA EN USO");
                        }
                        else{
                            try {
                                PreparedStatement ps3=con.prepareStatement("Select id_ciudad from tb_ciudades where nom_ciudad='"+ciudad+"'");
                                ResultSet rs3 = ps3.executeQuery();
                                int id_ciudad=0;
                                if(rs3.next()){
                                    id_ciudad = rs3.getInt("id_ciudad");
                                }
                                //PREPARO LA OCNSULTA QUE VA A INSERTAR LOS DATOS DE EL USSUARIO EN LA TABLA CORRESPONDIENTE
                                PreparedStatement ps1=con.prepareStatement("INSERT INTO tb_usuario(nom_usuario,tel_usuario,ciudad_usuario,correo,contra)VALUES('"+nombre+"','"+telefono+"','"+id_ciudad+"','"+correo+"','"+paswor+"')");
                                //EJECUTO LA CONSULTA
                                ps1.executeUpdate();

                                JOptionPane.showMessageDialog(null,"GUARDADDO CORRECTAMENTE");
                                inicio u = new inicio();
                                u.setVisible(true);
                                frame.setVisible(false);
                                }
                                catch (Exception e) {
                                    JOptionPane.showMessageDialog(null,"ERROR DE CONSULTA "+e);
                                }

                        }
                    } catch (Exception e) {
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"CORREO NO PERMITIDO");
                }
            
        }
    }
    
    //COMPARA SI EL CORREO EXISTE LO HICE TAMBIEN APARTE Y ASIGNE ESTE METODO A CADA JOBJET DE EL FRAME
    public void correo(String email){
        String id = null;
        try {
            PreparedStatement ps=con.prepareStatement("SELECT id_usuario from tb_usuario where correo='"+email+"'");
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                    id = rs.getString("id_usuario");
            }
            if (id!=null) {
                JOptionPane.showMessageDialog(null,"ESTE CORREO YA ESTA EN USO");
            }
            else{
                
                
            }
        } catch (Exception e) {
        }
        
    }
    
    

    //REGISTRO DE CLUB
    public void registroClub(String nombre,String deporte,String descripcion,String nivel,int cantidad,JFrame frame){
        //TRAigo la id de la ciudad de el usuario para asignarsela automaticamente al club
        int ciudad=traer.getCiudad_usu();
        int id_admin=traer.getId_usu();
        //valida que todos los campos esten llenos
        if(nombre.isEmpty()| deporte.isEmpty()|descripcion.isEmpty()|nivel.isEmpty()){
            JOptionPane.showMessageDialog(null,"LLENE TODOS LOS CAMPOS");
        }else{
            try {
                //inserta en la tabla club todos los datos de el mismo
                PreparedStatement ps=con.prepareStatement("INSERT INTO tb_club(nom_club,num_mien,club_deporte,club_ciudad,descripcion,fk_id_admin,nivel_juego)VALUES('"+nombre+"','"+cantidad+"','"+deporte+"','"+ciudad+"','"+descripcion+"','"+id_admin+"','"+nivel+"')");
                ps.executeUpdate();
                PreparedStatement ps1 = con.prepareStatement("SELECT id_club from tb_club where nom_club = '"+nombre+"'");
                ResultSet rs1 = ps1.executeQuery();
            
                if(rs1.next()){
                        int id_club = rs1.getInt("id_club");
                        try {
                            //agrega automaticamente al creador de el club a su propio club
                            PreparedStatement ps2=con.prepareStatement("INSERT INTO usuario_club(fk3_id_usuario,fk_id_club)VALUES('"+id_admin+"','"+id_club+"')");
                            ps2.executeUpdate(); 
                            JOptionPane.showMessageDialog(null,"CLUB CREADO CON EXITO");
                            MostrarClub();
                            usuario u = new usuario();
                            u.setVisible(true);
                            frame.setVisible(false);
                    } catch (Exception e) {
                    }
                }
                     
                
                
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"ERROR DE CONSULTA "+e);
            }
        }
    }
    
    //metodo para iniciar sesion
    public void inciar(String usu, String pas, JFrame frame){
        int id=0;
        //validacion de campos llenos
        if(usu.isEmpty()| pas.isEmpty()){JOptionPane.showMessageDialog(null, "LLENE LOS DOS CAMPOS");}
        else{
            try {
                //lamo en la base de datos un usuario con el correo ingresado
                PreparedStatement ps = con.prepareStatement("SELECT correo,contra,id_usuario,ciudad_usuario from tb_usuario where correo = '"+usu+"'");
                ResultSet rs = ps.executeQuery();
                
                if(rs.next()){
                    String usua = rs.getString("correo");
                    String pa = rs.getString("contra");
                    id=rs.getInt("id_usuario");
                    int ciudad= rs.getInt("ciudad_usuario");

                    //Compara que el correo y la contraseña sean iguales
                    if(usu.equals(usua)){
                        if(pas.equals(pa)){
                            bienvenido u = new bienvenido();
                            u.setVisible(true);
                            frame.setVisible(false);
                            traer.setId_usu(id);
                            traer.setCiudad_usu(ciudad);
                        }else{
                            //si la contraseña no coincide con el correo ingresado
                            JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                        }
                    }else{
                       
                    }
                }else{
                    //si el correo no se encuentra en la base de datos
                    JOptionPane.showMessageDialog(null, "correo no registrado");
                }

            } catch (Exception ex) {
            }
    } 
    }
   
    
    public void MostrarUsuario(){
        //llama la id de el ussuario que inicio sesio 
        int id = traer.getId_usu();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT nom_usuario from tb_usuario where id_usuario = '"+id+"'");
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                            //guarda el nombre de ussuario para mandarlo al jframe
                            traer.setNombre_usu(rs.getString("nom_usuario"));
                        }
            
            
        } catch (Exception e) {
        }
    } 
    
    
    
    //metodo para mostrar el nombre de el club de el que el ususario que ingreso es administrador
    public void MostrarClub(){
        int id = traer.getId_usu();
        try {
            
            PreparedStatement ps = con.prepareStatement("SELECT nom_club from tb_club where fk_id_admin = '"+id+"'");
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                            //si no se extrae ningun dato quiere decir que el usuario aun no es admin
                            traer.setNom_club(rs.getString("nom_club"));
                        }
            
            
        } catch (Exception e) {
        }
    } 
    
    
    
    
    //tabla el la que se muestran todos los clubs
    public void tabla_club(int opcion, String valor, JTable grupos){
        int id = traer.getId_usu();
        DefaultTableModel tabla1 = new DefaultTableModel();
        //se establece el nombre de cada columna
        tabla1.addColumn("ID");
        tabla1.addColumn("Grupos");
        tabla1.addColumn("Ciudad");
        tabla1.addColumn("Deporte");
        tabla1.addColumn("nivel");
        grupos.setModel(tabla1);
        //esto establece el ancho de cada columna
        grupos.getColumnModel().getColumn(1).setPreferredWidth(350);
        //este es para que el usuario no pueda modificar el ancho de la columna
        grupos.getColumnModel().getColumn(1).setResizable(false);
        grupos.getColumnModel().getColumn(2).setPreferredWidth(150);
        grupos.getColumnModel().getColumn(2).setResizable(false);
        grupos.getColumnModel().getColumn(0).setPreferredWidth(50);
        grupos.getColumnModel().getColumn(0).setResizable(false);
        
        
        String sql;
        //consulta segun la busqueda de el usuario, su no busca nada la consulta e sque salgan todos los grupos
        if(opcion == 0 && valor == null){
            sql = "SELECT id_club,nom_club,club_deporte,nivel_juego,nom_ciudad from tb_club,tb_ciudades WHERE club_ciudad=id_ciudad";
        }else{
            if( opcion == 0 &&  valor != null ){
                //si valor es diferente de null entonces buscara por nombre o por ciudad
                sql = "SELECT id_club,nom_club,club_deporte,nivel_juego,nom_ciudad from tb_club,tb_ciudades where nom_club = '"+valor+"' OR nom_ciudad='"+valor+"' and club_ciudad=id_ciudad;" ;
                
            }else{
                sql = "SELECT id_club,nom_club,club_deporte,nivel_juego,nom_ciudad from tb_club,tb_ciudades WHERE club_ciudad=id_ciudad" ;
            }
        }
        //se crea un arreglo en el que se guardaran los datos
        String []datos = new String[5];
        
        try {
            //se ejecuta una consulta segun la eleccion anterior
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                //se le dan los datos a cada columna correspondiente
                datos[0] = rs.getString("id_club");
                datos[1] = rs.getString("nom_club");
                datos[2]= rs.getString("nom_ciudad");
                datos[3]= rs.getString("club_deporte");
                datos[4]= rs.getString("nivel_juego");
                tabla1.addRow(datos);
            }grupos.setModel(tabla1);
            
            
        } catch (Exception e) {
            
        }
    }
    
    
    
    //Metodo para unirse al club
    public void unirClub(String club,String id_club2) {
        //de el jframe se eXtraen el id de el club y el nombre
        //se trae el id de el usuario que inicio sesion
        int id = traer.getId_usu();
        int id_club = 0;
        //estos contadores son para comparar si el grupo esta lleno
        int x = 0;
        int y = 0;
        try {
            //se eatraen todos los datos de la tabla usuario club, y por cada registro se suma 1
            PreparedStatement ps1 = con.prepareStatement("SELECT fk_id_club from usuario_club where fk_id_club ='"+id_club2+"'");
            ResultSet rs1 = ps1.executeQuery();
            while(rs1.next()){
                x+=1;
                
            }
            //se extrae la cantidad de miembros que establecio el creadorsi la variable x es superor a la y entonces no deja que nadie mas se una
            PreparedStatement ps = con.prepareStatement("SELECT num_mien from tb_club where id_club = '"+id_club2+"'");
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                
                y=rs.getInt("num_mien");
                
            }
        } catch (Exception e) {
        }
        //si la variable x es superor o igual a la y entonces no deja que nadie mas se una
        if(x==y | x>y){
            JOptionPane.showMessageDialog(null,"El Club: "+club+" ya esta lleno");
        }else{
            try {
                
                PreparedStatement pss = con.prepareStatement("SELECT id_club from tb_club where nom_club = '"+club+"'");
                ResultSet rss = pss.executeQuery();

                if(rss.next()){
                    id_club = rss.getInt("id_club");
                            }


            } catch (Exception e) {
            }
            try {

                //se valida que el si el usuario esta en este club
                PreparedStatement sql= con.prepareStatement("SELECT fk_id_club from usuario_club WHERE fk3_id_usuario = '"+id+"' AND fk_id_club='"+id_club2+"'");
                ResultSet sqlrs= sql.executeQuery();
                if(sqlrs.next()){
                    String id_club3= sqlrs.getString("fk_id_club");
                    //si ya esta pues no lo deja volver a unise
                    JOptionPane.showMessageDialog(null,"Ya formas parte de el club: "+club);

                }else{
                    //por ultimo si se cumplen todas las condiciones, al usuario se le permite ingresar al nuevo club
                    PreparedStatement ps=con.prepareStatement("INSERT INTO usuario_club(fk3_id_usuario,fk_id_club)VALUES('"+id+"','"+id_club+"')");
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Ahora formas parte de: "+club);

                }



            } catch (Exception e) {
            }
        }
    }
    
    
    
    //tabla que muestra los clubs a los que el usuario se ha unido
    public void tabla_clubadd(int opcion, String valor, JTable grupos){
        
        //se pide la id de el usuario que inicio sesion
        int id = traer.getId_usu();
        DefaultTableModel tabla1 = new DefaultTableModel();
        tabla1.addColumn("id");
        tabla1.addColumn("nombre");
        tabla1.addColumn("deporte");
        grupos.setModel(tabla1);
        String sql;
        grupos.getColumnModel().getColumn(1).setPreferredWidth(500);
        grupos.getColumnModel().getColumn(1).setResizable(false);
        grupos.getColumnModel().getColumn(2).setPreferredWidth(200);
        grupos.getColumnModel().getColumn(2).setResizable(false);
        grupos.getColumnModel().getColumn(0).setPreferredWidth(60);
        grupos.getColumnModel().getColumn(0).setResizable(false);
        sql= "SELECT fk_id_club,nom_club,club_deporte from usuario_club,tb_club where `fk3_id_usuario` = '"+id+"' AND id_club=fk_id_club";
        
        String []datos = new String[3];
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            
            while(rs.next()){
                datos[0] = rs.getString("fk_id_club");
                datos[1] = rs.getString("nom_club");
                datos[2] = rs.getString("club_deporte");
                tabla1.addRow(datos);
            }grupos.setModel(tabla1);
            
            
        } catch (Exception e) {
            
        }
    }
    
    
    
    
    //metod utilizado para mostrar el nombre de el grupo al que se ingreso y el nombre de su administrador
    public void datos_chat(int id_club1){
        //se trae la id de le grupo al que se ingreso
        traer.setId_club(id_club1);
        try {
            //consulta que trae el nombre de el club y el fk de el admin segun la id de el club
            PreparedStatement ps = con.prepareStatement("SELECT nom_club,fk_id_admin from tb_club where id_club = '"+id_club1+"'");
            ResultSet rs = ps.executeQuery();
            
            
            if(rs.next()){
                //se guardan los datos para enviarlos al jframe de chat           
                traer.setNom_club2(rs.getString("nom_club"));
                int id_admin = rs.getInt("fk_id_admin");
                traer.setId_admin(id_admin);
                try {
                    //esta consulta extrae el nombre de el admin segun la id de el admin extraida anteriormente
                    PreparedStatement ps1 = con.prepareStatement("SELECT nom_usuario from tb_usuario where id_usuario = '"+id_admin+"'");
                    ResultSet rs1 = ps1.executeQuery();
                    if(rs1.next()){
                        String nombre= rs1.getString("nom_usuario");
                        //se guarda el nombre de el admin para mostrarlo en el jframe de chat_club
                        traer.setNom_admin(nombre);
                    }
                } catch (Exception e) {
                }
            }
            
            
        } catch (Exception e) {
        }
    }
    
    

    
    //metodo para enviar mensajes
    public void enviarmsj(String mensaje){
        //se eXtrae la id de el usuario que inicio secion y la id de el grupo en el que ingreso
        int id_club =traer.getId_club();
        int id_usu = traer.getId_usu();
        int id_union=0;
        //si el mensaje esta vacio se le pide que ingrese un mensaje
        if(mensaje.isEmpty()){
            JOptionPane.showMessageDialog(null,"Escriba un mensaje");
        }else{
            try {
                PreparedStatement ps2=con.prepareStatement("select id_union from usuario_club where fk3_id_usuario='"+id_usu+"' and fk_id_club='"+id_club+"'");
                ResultSet rs2=ps2.executeQuery();
                if(rs2.next()){
                    id_union=rs2.getInt("id_union");
                }
                //si hay mensaje inserta en la tabla mensajes el mensaje, la id de el usuario y la id de el club
                PreparedStatement ps=con.prepareStatement("INSERT INTO tb_mensajes(mensaje,fkid_union)VALUES('"+mensaje+"','"+id_union+"')");
                ps.executeUpdate();
                
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"ERROR DE CONSULTA "+e);
            }
        }
    }
    
    
    
    //metodo para mostrar todos los mensajes se hace el mismo proseco de las tablas anteriore
    public void tabla_mensajes(int opcion, String valor, JTable grupos){
        int id=traer.getId_club();
        DefaultTableModel tabla1 = new DefaultTableModel();
        tabla1.addColumn("");
        tabla1.addColumn("Nombre");
        tabla1.addColumn("Mensaje");
        grupos.setModel(tabla1);
        grupos.getColumnModel().getColumn(2).setPreferredWidth(1400);
        grupos.getColumnModel().getColumn(1).setPreferredWidth(500);
        //este valor es tan bajo porque no queria que se viera la id de el mensaje pero necesitaba mostrarla en la tabla
        grupos.getColumnModel().getColumn(0).setPreferredWidth(1);
        grupos.getColumnModel().getColumn(0).setResizable(false);
        //consulta de todos los mensajes
        
        String sql ="SELECT fk_id_club,fk3_id_usuario,nom_usuario,mensaje,id_mensaje from usuario_club,tb_usuario,tb_mensajes where fkid_union=id_union AND fk3_id_usuario=id_usuario and fk_id_club='"+id+"'";
       
        String []datos = new String[3];
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                datos[0] = rs.getString("id_mensaje");
                datos[1] = rs.getString("nom_usuario");
                datos[2] = rs.getString("mensaje");
                tabla1.addRow(datos);
            }grupos.setModel(tabla1);
            
            
        } catch (Exception e) {
            
        } 
    }
    
    
    //metodo para mostrar algunos datos de el club
    public void mostrar_descripcion(String club){
        //contador de personas en el club
        int x = 0;
        //total de cupos disponibles
        int y = 0;
        try {
            //se extrae la cantidad de registros con la fk de el club seleccionado
            PreparedStatement ps1 = con.prepareStatement("SELECT fk_id_club from usuario_club where fk_id_club ='"+club+"'");
            ResultSet rs1 = ps1.executeQuery();
            while(rs1.next()){
                x+=1;
                
            }
            //es el mismo metodo utilizado para comparar si aun hay cupos libre que 
            //se utiliza en la union, pero en este caso es unicamente para mostrar
            PreparedStatement ps = con.prepareStatement("SELECT descripcion,num_mien from tb_club where id_club = '"+club+"'");
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                String descri= rs.getString("descripcion");
                y=rs.getInt("num_mien");
                traer.setDescri(descri);
            }
        } catch (Exception e) {
        }
        traer.setCantidad(" "+x+" de: "+y);
    }
    
    
    //metodo para eliminar club
    public void eliminarClub(){
    int id= traer.getId_club();
    
        try {
            //las consultas estan por separa porque la eliminacion debe hacerse en este orden
            PreparedStatement ps = con.prepareStatement("DELETE FROM `tb_mensajes` WHERE `tb_mensajes`.`fkid_club` = '"+id+"'");
            ps.executeUpdate();
            
            PreparedStatement ps1 = con.prepareStatement("DELETE FROM usuario_club WHERE fk_id_club = '"+id+"'");
            ps1.executeUpdate();
            
            PreparedStatement ps2 = con.prepareStatement("DELETE FROM `tb_club` WHERE `tb_club`.`id_club` = '"+id+"'");
            ps2.executeUpdate();
            JOptionPane.showMessageDialog(null,"Grupo Eliminado Satisfactoriamente");
            
        } catch (Exception e) {
        }
        
    }
    //metodo para eliminar todos los mensajes
    public void eliminarMen(String mensa){
        //se trae de el frame la id de el mensaje seleccionado, tambiens e trae la id de el usuario que ingreso
        int id=traer.getId_usu();
        //en esta variable se va a guardar el fk de el usuario que envion el mensaje
        int id_menusu=0;
        //se trae la id de el administrador
        int id_admin=traer.getId_admin();
        
            try {
                //consulta que trae la id de le usuario que envio el mensaje
                PreparedStatement ps = con.prepareStatement("SELECT id_union,fkid_union,fk3_id_usuario from tb_mensajes,usuario_club where id_mensaje = '"+mensa+"' and fkid_union =id_union");
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    id_menusu= rs.getInt("fk3_id_usuario");
                    
                }
                //si la ide el usuario que ingreso es igual a la ide de el usaurio que envio  el mensaje o el usuario que ingreso fue el admin  entonces lo deja eliminar el mensaje
                if(id==id_menusu | id==id_admin){
                    PreparedStatement ps1 = con.prepareStatement("DELETE FROM `tb_mensajes` WHERE `tb_mensajes`.`id_mensaje` = '"+mensa+"'");
                    ps1.executeUpdate();
                    JOptionPane.showMessageDialog(null,"MENSAJE ELIMINADO");
                }else{
                    JOptionPane.showMessageDialog(null,"No puedes eliminar este mensaje porque no es tuyo");
                }
            } catch (Exception e) {
            }
            
        
    }
    
    //metodo para salirse de el club
    
    //eliminar todos los mensajes, este metodo se utiliza cuando del usaurio se va a salir de un club y quiere eliminar todos los mensajes que envio
    public void eliminartm(){
        //se trae la id de el usuario y de el club en el que esta
        int id=traer.getId_usu();
        int id_club=traer.getId_club();
        int id_menusu=0;
        try {
            PreparedStatement ps = con.prepareStatement("SELECT id_union from usuario_club where fk3_id_usuario = '"+id+"' and fk_id_club ='"+id_club+"'");
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    id_menusu= rs.getInt("id_union");
                    
                }
            //se elimina de la tabla mensaje todas las filas en la suqe las dos ids coincidad
            PreparedStatement ps1 = con.prepareStatement("DELETE FROM `tb_mensajes` WHERE `tb_mensajes`.`fkid_union` = '"+id_menusu+"'");
            ps1.executeUpdate();
            JOptionPane.showMessageDialog(null,"Mensajes Eliminados");
            PreparedStatement ps3 = con.prepareStatement("DELETE FROM `usuario_club` WHERE fk3_id_usuario = '"+id+"' and fk_id_club= '"+id_club+"'");
            ps3.executeUpdate();
            JOptionPane.showMessageDialog(null,"Ya no formas parte de este club: ");
        } catch (Exception e) {
        }
    }
    
    //metodo para editar club
    public void editarClub(String nombre,String deporte,String descripcion,String nivel,int cantidad,JFrame frame){
        //se trae la id de el club
        int id=traer.getId_club();
        //validacion de campos
        if(nombre.isEmpty()| deporte.isEmpty()|descripcion.isEmpty()|nivel.isEmpty()){
            JOptionPane.showMessageDialog(null,"LLENE TODOS LOS CAMPOS");
        }else{
            try {
                //se actualizan todos los datos de el club segun su id
                PreparedStatement ps=con.prepareStatement("UPDATE `tb_club` SET `nom_club` = '"+nombre+"',`club_deporte`='"+deporte+"', `descripcion` = '"+descripcion+"',`nivel_juego`='"+nivel+"',`num_mien`='"+cantidad+"' WHERE `tb_club`.`id_club` = '"+id+"'");
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Grupo editado con exito");
                //se ejecuta el metodo mostrar para que cargue el nuevo numbre y datos de el chat para que se actualicen los datos tambine en elchat
                MostrarClub();
                datos_chat(id);
                Chat_Club u = new Chat_Club();
                u.setVisible(true);
                frame.setVisible(false);
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"ERROR DE CONSULTA "+e);
            }
        }
    }
    
    //metodo para mostrar en el frame de editar club los datos anteriores de el club
    //se ponen como para metros los objetos jObjets a los que se le asignaran los valores
    public void mostrar(JTextField nombre, JTextField descrip,JLabel nivel,JLabel canti,JLabel Depor){
        //se trae la id de el club
        int id=traer.getId_club();
        try {
            //se llamn los campos requeridos de el club
            PreparedStatement ps = con.prepareStatement("Select nom_club,descripcion,nivel_juego,num_mien,club_deporte from tb_club where id_club='"+id+"'");
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                
                String nomb = rs.getString("nom_club");
                String des=rs.getString("descripcion");
                String niv=rs.getString("nivel_juego");
                String can=rs.getString("num_mien");
                String dep=rs.getString("club_deporte");
                //se asigna cada uno a su respectivo jOBjet
                nombre.setText(nomb);
                descrip.setText(des);
                nivel.setText(niv);
                canti.setText(can);
                Depor.setText(dep);
                
                
            }
            
        } catch (Exception e) {
        }
        
    }
    
    //metodo que muestra todos los datos de el usuario en el jframe de edicion
    public void editarusu1(JTextField nombre, JTextField correo,JLabel ciudad,JTextField tel,JPasswordField contra){
        int id=traer.getId_usu();
        try {
            PreparedStatement ps = con.prepareStatement("Select nom_usuario,ciudad_usuario,tel_usuario,contra,correo from tb_usuario where id_usuario='"+id+"'");
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                
                String nomb = rs.getString("nom_usuario");
                String email=rs.getString("correo");
                String ciu=rs.getString("ciudad_usuario");
                String tele=rs.getString("tel_usuario");
                String con=rs.getString("contra");
                
                nombre.setText(nomb);
                correo.setText(email);
                ciudad.setText(ciu);
                tel.setText(tele);
                contra.setText(con);
                
                
            }
            
        } catch (Exception e) {
        }
        
    }
    //metodo para editar usuario
    public void editarusu2(String nombre,String correo,String telefono,String ciudad,String paswor,JFrame frame){
        //se traen todos los datos de el jframe de edicion
        //se trae id d eel usuario
        int id=traer.getId_usu();
        int id_ciudad=0;
        int id5=0;
        //validacion de campos 
        if(nombre.isEmpty()| correo.isEmpty()|telefono.isEmpty()|ciudad.isEmpty()|paswor.isEmpty()){//COMPARO QUE LOS CAMPOS NO ESTEN VACIOS, SI LO ESTAN SALTA EL PANEL DE AVISO
            JOptionPane.showMessageDialog(null,"LLENE TODOS LOS CAMPOS");
        }else{
            //validacion de caracteres de correo
                if(correo.contains("@gmail.com") || correo.contains("@soysena.com") || correo.contains("@misena.com") || correo.contains("@hotmail.com") || correo.contains("@outlook.com")|| correo.contains("@misena.edu.co")|| correo.contains("@sena.co")){
                //VALIDO QUE EL CORREO SEA ALGUNO DE LOS VALIDOS
                   
                    
                    //verifico si el correose encuentra en la tabla, si el valor es diferente de null entonces esta en uso
                    try {
                        //se comprueba que el nuevo correo no lo tenga ya otro usuario
                        PreparedStatement ps5=con.prepareStatement("SELECT id_usuario from tb_usuario where correo='"+correo+"'");
                        ResultSet rs5 = ps5.executeQuery();
                        if(rs5.next()){
                                id5 = rs5.getInt("id_usuario");
                        }
                        if (id5==0  | id5==id) {
                            //esta consulta esta de esta manera ya que en el registro se saca el id con el nombre, pero cuando se llaman los datos
                            //se trae el id pero si se cambia la consulta se hace con el nombre
                            PreparedStatement ps3=con.prepareStatement("Select id_ciudad from tb_ciudades where nom_ciudad='"+ciudad+"' or id_ciudad='"+ciudad+"'");
                                ResultSet rs3 = ps3.executeQuery();
                                
                                if(rs3.next()){
                                    id_ciudad = rs3.getInt("id_ciudad");
                                }
                            //se actualiza en la tabla de usuario los datos editados
                            PreparedStatement ps=con.prepareStatement("UPDATE `tb_usuario` SET `nom_usuario` = '"+nombre+"', `ciudad_usuario` = '"+id_ciudad+"',`tel_usuario`='"+telefono+"',`correo`='"+correo+"',`contra`='"+paswor+"' WHERE `tb_usuario`.`id_usuario` = '"+id+"'");
                            ps.executeUpdate();
                            JOptionPane.showMessageDialog(null,"usuario editado con exito editado con exito");
                            MostrarUsuario();
                            usuario u = new usuario();
                            u.setVisible(true);
                            frame.setVisible(false);
                            
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"ESTE CORREO YA ESTA EN USO");
                        }
                    }
                    catch (Exception e) {
                        JOptionPane.showMessageDialog(null,"ERROR DE CONSULTA "+e);
                    }
                }  
        }
    }
}



            
    
