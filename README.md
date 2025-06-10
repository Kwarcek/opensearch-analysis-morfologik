# Morfologik Polish Lemmatizer plugin for OpenSearch
Simple OpenSearch analysis plugin for Polish language. It uses [lucene-analysis-morfologik](https://lucene.apache.org) which is java library
base on [Morfologik](http://morfologik.blogspot.com).

## Dependecies
* org.apache.lucene:lucene-analysis-morfologik
* org.carrot2:morfologik-stemming
* org.carrot2:morfologik-polish
* org.carrot2:morfologik-fsa

## Install

### OpenSearch
```
opensearch-plugin install https://github.com/Kwarcek/opensearch-analysis-morfologik/releases/download/2.19.2/opensearch-analysis-morfologik-2.19.2.zip
```

### Containerfile
```
FROM opensearchproject/opensearch:2.19.2

RUN opensearch-plugin install https://github.com/Kwarcek/opensearch-analysis-morfologik/releases/download/2.19.2/opensearch-analysis-morfologik-2.19.2.zip
```

Helpful links:
* https://github.com/apache/lucene 
* https://github.com/morfologik/morfologik-stemming
* https://github.com/allegro/elasticsearch-analysis-morfologik
