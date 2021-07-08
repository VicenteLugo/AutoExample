/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package auto;

import java.util.ArrayList;

/**
 *
 * @author LugoD
 */
public class TestAuto {
    public static void main(String[] args) {
        Auto car=new Auto();
        car.setMarca("Ford");
        car.setAño("1995");
        car.setTipo("Deportivo");
        
        Auto schlitten=new Auto();
        schlitten.setMarca("Nissan");
        schlitten.setAño("2051");
        schlitten.setTipo("Limosina");
        
        Auto auto=new Auto();
        auto.setMarca("Lamborgini");
        auto.setAño("6515");
        auto.setTipo("Camioneta");
        
        Auto warthog=new Auto();
        warthog.setMarca("Audi");
        warthog.setAño("2015");
        warthog.setTipo("Furgoneta");
                
        Auto halconMilenario=new Auto();
        halconMilenario.setMarca("Ferrari");
        halconMilenario.setAño("1995");
        halconMilenario.setTipo("Deportivo");
        
        ArrayList lista =new ArrayList();
        lista.add(car);
        lista.add(schlitten);
        lista.add(auto);
        lista.add(warthog);
        lista.add(halconMilenario);
        
        Auto aut;
        int cont=1;
        for (Object listaCarros : lista) {
            aut=(Auto) listaCarros;
            System.out.println(cont++ +".-"+aut.getMarca()+" "+aut.getAño()+" "+aut.getTipo());
        }
    }
}
