/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Aluno;
import database.Conexao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class AlunoDAO {
    public List<Aluno> obetTodos() {
        List<Aluno> alunos = new ArrayList<>();
        return alunos;
    }
    
    public Aluno obterPeloId(int id) {
        Aluno aluno = null;
        return aluno;
    }
    public int inserir(Aluno aluno) {
        Conexao conexao = new Conexao();
        if (conexao.conectar()) {
            conexao.session.save(aluno);
            conexao.transaction.commit();
            conexao.session.close();
            return aluno.getId();
        }
        return -1;
    }
    public boolean alterar(Aluno aluno){
        return false;
    }
    public boolean excluir(int id) {
        return false;
    }
}
