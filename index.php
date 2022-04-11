<?php

require 'inc.php';

function main() {
    $a = source();
    sink($a);

    $d = new Demo();
    $d->source();
}
main();

