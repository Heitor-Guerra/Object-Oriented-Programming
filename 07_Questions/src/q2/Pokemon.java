package q2;

import java.util.Random;

public abstract class Pokemon implements PersonagemDeLuta<Pokemon> {
  private final int hpMax;
  private final int ataque1;
  private final int ataque2;
  private int hp;

  public Pokemon(int hpMax, int ataque1, int ataque2) {
    this.hp = hpMax;
    this.hpMax = hpMax;
    this.ataque1 = ataque1;
    this.ataque2 = ataque2;
  }

 	public boolean atacar(Pokemon personagemAtacado) {
  	Random r = new Random();
  	boolean isAtaque1 = r.nextBoolean();
    if(isAtaque1) {
      personagemAtacado.hp -= this.ataque1;
    } else {
      personagemAtacado.hp -= this.ataque2;
    }
    return personagemAtacado.hp <= 0;
  }

	public void regenera() {
	  this.hp = hpMax;
	}

	public int getPontosVitalidade() {
	  return this.hp;
	}

}
