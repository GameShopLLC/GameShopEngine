/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameShopEngine.UI.Components;

import GameShopEngine.UI.GameShopUIATMS;
import org.joml.Vector2f;
import org.joml.Vector4f;

/**
 *
 * @author lynden
 */
public class GameShopUIComponent {
    
    public Vector2f position;
    public Vector2f size;
    
    public GameShopUIATMS uiATMS;
    
    public Vector4f backgroundColor;
    public Vector4f textColor;
    
    public GameShopUIComponent(String name, Vector2f position, Vector2f size, GameShopUIATMS uiATMS){
    
        this.position = position;
        this.size = size;
            
        this.uiATMS = uiATMS;
        this.backgroundColor = new Vector4f();
        this.textColor = new Vector4f();
    }
    
    public void onClick(Vector2f clickPos){
    
        if (((clickPos.x > this.position.x) && (clickPos.y < this.position.y)) &&((clickPos.x < this.position.x + this.size.x) && (clickPos.y < this.position.y + this.size.y))) {
       
            onClickAction();
        }
    }
    
    public void onClickAction(){
    
    }
    
    public void render(){
    
        this.uiATMS.uiLayer.drawRectangle(position, new Vector2f(position.x + size.x, position.y + size.y), backgroundColor);
     //this.uiATMS.uiLayer.drawSquare(5, 5, 5, backgroundColor);
    
    }
}