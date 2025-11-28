/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnimalSound;

/**
 *
 * @author ISHFAA TAJ
 */
 class Dog implements Animal
{
    @Override
    public void makeSound(String sound)
    {
        System.out.println("Dog Barks: "+sound);
    }
}
