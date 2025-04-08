/* Autor...: Felipe Souza
   Data....: 05/03/2025
   Objetivo: Lista Simplismente cadeada */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>
#include <windows.h>


// Definição de registro de cliente

typedef struct
{
    int cd_cliente;
    char nm_cliente[50];
    char ds_endereco[50];
    int nr_numero;
    char nr_documento[50];
    char ds_cidade[50];
    char ds_uf[05];
    char dt_cadastro[19];
    char nr_telefone[15];
} reg_cliente;

typedef struct TipoItem *TipoApontador;

typedef struct TipoItem
{
    reg_cliente info;
    TipoApontador prox;
} TipoItem;

typedef struct
{
    TipoApontador primeiro;
    TipoApontador ultimo;

} TipoLista;

void gotoxy(int x, int y)
{

    COORD coord;

    coord.X = (short)x;
    coord.Y = (short)y;

    SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), coord);
}

void imprimir_linha(int linha)
{
    int i;

    gotoxy(01, linha);
    printf("+");

    gotoxy(01, linha);
    for (i = 2; i < 80; i++)
    {
        gotoxy(i, linha);
        printf("-");
    }

    gotoxy(80, linha);
    printf("+");
}

void tela()
{

    int i;
    system("cls");
    imprimir_linha(1);
    gotoxy(03, 03);
    printf("Instituicao...: Unicv");

    gotoxy(03, 02);
    printf("Autor.........: Felipe");

    gotoxy(50, 02);
    printf("Data....: 02-04-2025");

    gotoxy(50, 03);
    printf("LISTA SIMPLESMENTE ENCADEADA");
    gotoxy(02, 23);
    printf("MSG.:");

    for (i = 2; i < 24; i++)
    {

        gotoxy(01, i);
        printf("|");

        gotoxy(80, i);
        printf("|");
    }
    imprimir_linha(4);
    imprimir_linha(22);

    imprimir_linha(24);
}
void tela_cliente()
{
    system("cls");
    tela();
    gotoxy(10, 7);
    printf("0 - Digite o codigo...........:                 ");
    gotoxy(10, 9);
    printf("1 - Nome......................:                 ");
    gotoxy(10, 11);
    printf("2 - Endereco..................:                 ");
    gotoxy(10, 13);
    printf("3 - Cargo.....................:                 ");
    gotoxy(10, 15);
    printf("4 - Data de admissao..........:                 ");
    gotoxy(10, 17);
    printf("5 - Telefone..................:                 ");
    gotoxy(10, 19);
    printf("6 - Salario...................:                 ");
}

// Programa principal 
int main(){
    TipoLista L;
    L.primeiro = NULL;
    L.ultimo = NULL;
    int opc;
    system("color 1F");
    setlocale(LC_ALL, "portuguese-brazilian");
    le_arquivo(&L);
}
