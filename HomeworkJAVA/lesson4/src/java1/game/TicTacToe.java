package java1.game;

import java.util.Random;
import java.util.Scanner;
public class TicTacToe {
    Random random;
    Scanner scanner;
    char[][] table;
    TicTacToe(){
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[3][3]; 
    }
    public static void main(String[] args){
        new TicTacToe().game();
    }
    void game() {
        initTable();
        printTable();
        while(true){
            turnHuman();
            if(checkWin('X')){
                System.out.println("Вы выиграли!");
                break;
            }
            if(isTableFull()){
                System.out.println("Ничья...");
                break;
            }
            turnAI();
            printTable();
            if(checkWin('O')){
                System.out.println("Выиграл компьютер!");
                break;
            }
            if(isTableFull()){
                System.out.println("Ничья...");
                break;
            }
        }
        System.out.println("Конец игры.");
        printTable();
    }
    public void initTable(){
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table.length; j++){
                table[i][j] = '.';
            }
        }
    }
    public void printTable(){
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table.length; j++){
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void turnHuman(){
        int x, y;
        do{
            System.out.println("Введите значения x и y в пределах [1..3]: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }
        while(!isCellValid(x, y));
        table[x][y] = 'X';
    }
    public void turnAI(){
        int x = 0;
        int y = 0;
        boolean blockHuman = false;
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table.length; j++){
                if(isCellValid(i, j)){
                    table[i][j] = 'X';
                    if(checkWin('X')){
                        x = i;
                        y = j;
                        blockHuman = true;
                    }
                    table[i][j] = '.';
                }
            }
        }
        if(!blockHuman){
            do {
                x = random.nextInt(3);
                y = random.nextInt(3);
            }
            while (!isCellValid(x, y));
        }
        table[x][y] = 'O';
    }
    public boolean checkWin(char symbol){
        for(int i = 0; i < table.length; i++){
            if(table[i][0] == symbol && table[i][1] == symbol && table[i][2] == symbol ||
                    table[0][i] == symbol && table[1][i] == symbol && table[2][i] == symbol)
                return true;
        }
        if(table[0][0] == symbol && table[1][1] == symbol && table [2][2] == symbol ||
                table[2][0] == symbol && table[1][1] == symbol && table [0][2] == symbol) return true;
        return false;
    }
    public boolean isTableFull(){
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table.length; j++){
                if(table[i][j] == '.'){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isCellValid(int x, int y){
        if(x < 0 || y < 0 || x > 2 || y > 2){
            return false;
        }
        return table[x][y] == '.';
    }
}
