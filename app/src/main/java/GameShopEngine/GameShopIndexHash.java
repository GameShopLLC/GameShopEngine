/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameShopEngine;

import java.util.HashMap;
import static org.lwjgl.opengl.GL15.glGenBuffers;

/**
 *
 * @author gameshopengine
 */
public class GameShopIndexHash {
    
    private static GameShopIndexHash _instance;
    
    public HashMap<GameShopPoly, Integer> indexHash;
    
    private GameShopIndexHash(){
    
        indexHash = new HashMap<GameShopPoly, Integer>();
    }
    
    public static GameShopIndexHash getInstance(){
    
        if (_instance == null) {
        
            _instance = new GameShopIndexHash();
        }
        return _instance;
    }
    
    
    public void addIndex(GameShopPoly gsp){
    
        indexHash.put(gsp, glGenBuffers());
    }
}