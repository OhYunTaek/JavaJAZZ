/*
 * Code By OhYunTaek 2022.09.23(금)
 */
interface Edible {
    void eat();
}

interface Sweetable {
    void sweet();
}

interface Delicious extends Edible, Sweetable {
}