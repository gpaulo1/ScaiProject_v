package net.com.scaiprojectv.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QFuncionario is a Querydsl query type for Funcionario
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QFuncionario extends EntityPathBase<Funcionario> {

    private static final long serialVersionUID = 1994055611L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFuncionario funcionario = new QFuncionario("funcionario");

    public final QPessoa _super;

    public final EnumPath<net.com.scaiprojectv.enumerator.AcessoSistemaEnum> acessoSistema = createEnum("acessoSistema", net.com.scaiprojectv.enumerator.AcessoSistemaEnum.class);

    //inherited
    public final StringPath cpf;

    public final DateTimePath<java.util.Date> dataAdmissao = createDateTime("dataAdmissao", java.util.Date.class);

    //inherited
    public final DatePath<java.util.Date> dataNascimento;

    //inherited
    public final StringPath ddd;

    public final NumberPath<Short> diaVencimentoSalario = createNumber("diaVencimentoSalario", Short.class);

    // inherited
    public final QEstado estado;

    public final StringPath funcao = createString("funcao");

    //inherited
    public final NumberPath<Long> id;

    public final StringPath login = createString("login");

    //inherited
    public final StringPath nome;

    //inherited
    public final StringPath rg;

    public final NumberPath<Double> salario = createNumber("salario", Double.class);

    public final StringPath senha = createString("senha");

    //inherited
    public final ComparablePath<Character> sexo;

    //inherited
    public final StringPath sobrenome;

    //inherited
    public final StringPath telefone;

    public QFuncionario(String variable) {
        this(Funcionario.class,  forVariable(variable), INITS);
    }

    public QFuncionario(Path<? extends Funcionario> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QFuncionario(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QFuncionario(PathMetadata<?> metadata, PathInits inits) {
        this(Funcionario.class,  metadata, inits);
    }

    public QFuncionario(Class<? extends Funcionario> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QPessoa(type, metadata, inits);
        this.cpf = _super.cpf;
        this.dataNascimento = _super.dataNascimento;
        this.ddd = _super.ddd;
        this.estado = _super.estado;
        this.id = _super.id;
        this.nome = _super.nome;
        this.rg = _super.rg;
        this.sexo = _super.sexo;
        this.sobrenome = _super.sobrenome;
        this.telefone = _super.telefone;
    }

}

