/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto3_Web.interfaces;

import Reto3_Web.modelo.Order;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author david
 */
public interface InterfaceOrder extends MongoRepository<Order, Integer> {

 
    
    //Retorna las ordenes de pedido que coincidad con la zona recibida como parametro
    
    
    //Retorna las ordenes de pedido que coincidad con la zona recibida como parametro
    @Query("{'salesMan.zone': ?0}")
    List<Order> findByZone(final String zone);
    
    
    
    //Retorna las ordenes x estado
    @Query("{status: ?0}")
    List<Order> findByStatus(final String status);
    
    //Para seleccionar la orden con el id maximo
    Optional<Order> findTopByOrderByIdDesc();
    
    
    /*
    List<Order> findBySalesManZone(String zone); 
    List<Order> findBySalesManId(Integer id);  este
    List<Order> findBySalesManIdAndStatus(Integer id, String status); este
    List<Order> findByRegisterDayAndSalesManId(Date registerDay, Integer id); este
    
    
    
    */
    
}    
