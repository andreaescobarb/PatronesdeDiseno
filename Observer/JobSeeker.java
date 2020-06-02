/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author edujg
 */
public class JobSeeker implements Observer{
    private String name;
 
	public JobSeeker(String name){
		this.name = name;
	}
	@Override
	public void update(Subject s) {
		System.out.println(this.name + " :Notificado");
	}
}
