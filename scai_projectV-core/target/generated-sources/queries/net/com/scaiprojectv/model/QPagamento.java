package net.com.scaiprojectv.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPagamento is a Querydsl query type for Pagamento
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPagamento extends EntityPathBase<Pagamento> {

    private static final long serialVersionUID = -692335354L;

    public static final QPagamento pagamento = new QPagamento("pagamento");

    public final NumberPath<Long> diaVencimento = createNumber("diaVencimento", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> quantidadeParcela = createNumber("quantidadeParcela", Integer.class);

    public final EnumPath<net.com.scaiprojectv.enumerator.TipoPagamentoEnum> tipoPagamento = createEnum("tipoPagamento", net.com.scaiprojectv.enumerator.TipoPagamentoEnum.class);

    public QPagamento(String variable) {
        super(Pagamento.class,  forVariable(variable));
    }

    public QPagamento(Path<? extends Pagamento> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPagamento(PathMetadata<?> metadata) {
        super(Pagamento.class,  metadata);
    }

}

