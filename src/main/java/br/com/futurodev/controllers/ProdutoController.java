package br.com.futurodev.controllers;

import br.com.futurodev.model.ProdutoModel;
import br.com.futurodev.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping(value = "/produto/salvar")
    @ResponseBody
    public ResponseEntity<ProdutoModel> salvar (@RequestBody ProdutoModel produto) {

        ProdutoModel prod = produtoRepository.save(produto);
        return new ResponseEntity<ProdutoModel>(prod, HttpStatus.CREATED);

    }

    @PutMapping (value = "/produto/salvar")
    @ResponseBody
    public ResponseEntity<ProdutoModel> atualizar (@RequestBody ProdutoModel produto) {

        ProdutoModel prod = produtoRepository.save(produto);
        return new ResponseEntity<ProdutoModel>(prod, HttpStatus.CREATED);

    }

    @GetMapping(value = "/produto/deletar/{id}")
    public ResponseEntity<String> deletar (@PathVariable long id) {
        produtoRepository.deleteById(id);
        return new ResponseEntity<String>("Produto deletado com sucesso!", HttpStatus.OK);

    }

    @GetMapping(value = "/produto/procurar/{id}")
    public ResponseEntity<ProdutoModel> getProdutoById (@PathVariable long id) {
        ProdutoModel modelo = produtoRepository.findById(id).get();
        return new ResponseEntity<ProdutoModel>(modelo, HttpStatus.OK);
    }
}
