'use strict';
const fs = require('fs');
/*

「/dev/stdin」から開く。
それを「1」で区切る
それの配列要素数から1を引いて表示する。

*/
var __varslist = this.__varslist = [{}, {}, {}];
var __vars = this.__varslist[2];
var __self = this;
var __module = {};
this.__varslist[0]["!PluginSystem:初期化"]=function (sys) {
      sys.__v0['ナデシコバージョン'] = '3.0.70'
      // システム関数を探す
      sys.__getSysValue = function (name, def) {
        if (sys.__v0[name] === undefined) {return def}
        return sys.__v0[name]
      }
      // 全ての関数・変数を見つけて返す
      sys.__findVar = function (nameStr, def) {
        if (typeof nameStr === 'function') {return nameStr}
        for (let i = sys.__varslist.length - 1; i >= 0; i--) {
          let scope = sys.__varslist[i]
          if (scope[nameStr]) {return scope[nameStr]}
        }
        return def
      }
      // システム関数を実行する(エイリアスを実装するのに使う)
      sys.__exec = function (func, params) {
        const f = sys.__findVar(func)
        if (!f) {throw new Error('システム関数でエイリアスの指定ミス:' + func)}
        return f.apply(this, params)
      }
      // システム変数の値を変更する
      sys.__setVar = function (name, value) {
        sys.__v0[name] = value
      }
      // 前回設定したタイマーが実行中ならクリア
      if (sys.__timeout) {
        for (const t of sys.__timeout) { clearTimeout(t) }
      }
      sys.__timeout = []
      if (sys.__interval) {
        for (const t of sys.__interval) { clearInterval(t) }
      }
      sys.__interval = []
    };
this.__varslist[0]["!PluginNode:初期化"]=function (sys) {
      const path = require('path')
      sys.__getBinPath = (tool) => {
        let fpath = tool
        if (process.platform === 'win32')
          {if (!fileExists(tool)) {
            const nodeDir = path.dirname(process.argv[0])
            const root = path.resolve(path.join(nodeDir, '..'))
            fpath = path.join(root, 'bin', tool + '.exe')
            if (fileExists(fpath)) {return `"${fpath}"`}
            return tool
          }}

        return fpath
      }
      sys.__getBokanPath = () => {
        let nakofile
        const cmd = path.basename(process.argv[1])
        if (cmd.indexOf('cnako3') < 0)
          {nakofile = process.argv[1]}
         else
          {nakofile = process.argv[2]}

        return path.dirname(path.resolve(nakofile))
      }
      sys.__v0['コマンドライン'] = process.argv
      sys.__v0['ナデシコランタイムパス'] = process.argv[0]
      sys.__v0['ナデシコランタイム'] = path.basename(process.argv[0])
      sys.__v0['母艦パス'] = sys.__getBokanPath()
      sys.__v0['AJAX:ONERROR'] = null
    };
this.__varslist[0]["開"]=function (s) {
      return fs.readFileSync(s, 'utf-8')
    };
this.__varslist[0]["区切"]=function (s, a) {
      return ('' + s).split('' + a)
    };
this.__varslist[0]["配列要素数"]=function (a) {
      if (a instanceof Array)  // 配列ならOK
        {return a.length}

      if (a instanceof Object)
        {return Object.keys(a).length}

      return 1
    };
this.__varslist[0]["引"]=function (a, b) {
      return a - b
    };
this.__varslist[0]["表示"]=function (s, sys) {
      if (!sys.silent){ console.log(s) }
      sys.__varslist[0]['表示ログ'] += (s + '\n')
    };
const __v0 = this.__v0 = this.__varslist[0];
const __v1 = this.__v1 = this.__varslist[1];
__v0.line=0;// プラグインの初期化
__v0["!PluginSystem:初期化"](__self);
__v0["!PluginNode:初期化"](__self);
__vars["それ"] = '';
; __v0.line=1;//
(function(){ const tmp=__vars["それ"]=__v0["開"]("/dev/stdin",__self); return tmp;; }).call(this); __v0.line=1;//
; __v0.line=2;//
(function(){ const tmp=__vars["それ"]=__v0["区切"](__vars["それ"]/*?:2*/,"1",__self); return tmp;; }).call(this); __v0.line=3;//
(function(){ const tmp=__vars["それ"]=__v0["引"]((function(){ const tmp=__vars["それ"]=__v0["配列要素数"](__vars["それ"]/*?:3*/,__self); return tmp;; }).call(this),1,__self); return tmp;; }).call(this);
/*[sore]*/__v0["表示"](__vars["それ"],__self);
; __v0.line=3;//
; __v0.line=4;//
; __v0.line=5;//
; __v0.line=6;//
; __v0.line=6;// ---