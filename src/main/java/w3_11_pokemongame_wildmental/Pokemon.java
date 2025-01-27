package w3_11_pokemongame_wildmental;

import lombok.Getter;

@Getter
public class Pokemon implements IPokemon {
    private String pokemonName;
    private String pokemonName1;
    private String pokemonName2;
    private String pokemonName3;
    private String pokemonName4;
    // final private String pokemonName;
    //
    //    public Pokemon(String pokemonName) {
    //        this.pokemonName = pokemonName;
    //    }
    private String customName;
    private int HP;

    public Pokemon() {}

    public Pokemon(
        String pokemonName, String pokemonName1, String pokemonName2,
        String pokemonName3, String pokemonName4, String customName,
        int HP
    ) {
        this.pokemonName = pokemonName;
        this.pokemonName1 = pokemonName1;
        this.pokemonName2 = pokemonName2;
        this.pokemonName3 = pokemonName3;
        this.pokemonName4 = pokemonName4;
        this.customName = customName;
        this.HP = HP;
    }

    @Override
    public void attack(Pokemon tgPokemon) {
        // 데이터 및 동작 : tgPokemon.getHP(), tgPokemon.setHP()
        // 그 외 추가 동작 및 결과 출력
    }

    @Override
    public void flee(int enemyLv) {
        // 결과 출력
    }

    @Override
    public Pokemon evolve() {
        // 데이터 및 동작
        // : this.getLevel()
        // : this.setters()
        // 기존 객체 참조 삭제
        // 진화된 객체 생성 및 리턴
        return new EvolvedPokemon();
        // 리턴 타입은 부모 타입으로 선언되어 있는데
        // 실제 리턴 객체는 자식 타입으로 반환
        // => 다형성에 따른 부모 타입으로의 변환
    }
}