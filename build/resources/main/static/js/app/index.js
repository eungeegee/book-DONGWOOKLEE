var main = {  // 다른 객채와 겹침을 방지하는 방법 -> index.mustache 에서만 사용하도록, index 의 푸터에 현재 스크립트를 추가
  init : function() {
    var _this = this;
    $('#btn-save').on('click', function() {
      _this.save();
    });
    $('#btn-update').on('click', function() {
      _this.update();
    });
    $('#btn-delete').on('click', function() {
      _this.delete();
    });

  },
  save : function() {
    console.log('여기다');
    var data = {
      title: $('#title').val(),
      author: $('#author').val(),
      content: $('#content').val()
    };
    $.ajax({
      type: 'POST',
      url: '/api/v1/posts',
      dataType: 'json',
      contentType: 'application/json; charset=utf-8',
      data: JSON.stringify(data)
    }).done(function() {
      alert('글이 등록되었습니다.');
      window.location.href = '/';
    }).fail(function(err) {
      alert(JSON.stringify(err));
    });
  },
  update: function() {
    var data = {
      title: $('#title').val(),
      content: $('#content').val(),
    };
    var id = $('#id').val();

    $.ajax({
      type: 'PUT',
      url: '/api/v1/posts/'+id,
      dataType:'json',
      contentType:'application/json; charset=utf-8',
      data: JSON.stringify(data)
    }).done(function () {
      alert('글이 수정되었습니다.');
      window.location.href = '/';
    }).fail(function (err) {
      alert(JSON.stringify(err));
    });
  },
  delete: function () {
    var id = $('#id').val();

    $.ajax({
        type: 'DELETE',
        url: '/api/v1/posts/'+id,
        dataType: 'json',
        contentType:'application/json; charset=utf-8'
    }).done(function() {
        alert('글이 삭제되었습니다.');
        window.location.href = '/';
    }).fail(function (error) {
        alert(JSON.stringify(error));
    });
  }
};

main.init();